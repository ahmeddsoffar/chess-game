
package ChessCoreOurs;

import java.util.*;


public class ChessGame {
     private Board board;
     Board boardcopy;
     
     private Movment movments=new Movment();

    public Movment getMovments() {
        return movments;
    }

    public void setMovments(Movment movments) {
        this.movments = movments;
    }
     
     public ChessEnums.Color currentPlayer;
     private int capturedrow;
     private int capturedcol;
    
     private CareTaker caretaker;

    public CareTaker getCaretaker() {
        return caretaker;
    }

    public void setCaretaker(CareTaker caretaker) {
        this.caretaker = caretaker;
    }
    
     public String captured;
     public String rookcastlestart;
     public String rookcastleend;
     public ChessGame() {
        
        board  = new Board();////////////////////////////
        boardcopy= (Board)board.clone();
         saveBoardState(boardcopy.getBoard(),movments);
        currentPlayer = ChessEnums.Color.White;
        caretaker=new CareTaker();
       
     
    }


    public ChessEnums.Color getCurrentPlayer() {
        return currentPlayer;
    }
    

      public Momento saveBoardState(Square[][] board ,Movment movments) {
        // Deep copy the board and save it to the stack
         return copyBoard(board,movments);
        
    }
    
    
    
     private  Momento copyBoard(Square[][] originalBoard,Movment movments) {
        Square[][] copiedBoard = originalBoard;
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                Square originalSquare = originalBoard[i][j];
//                Piece originalPiece = (originalSquare != null) ? originalSquare.getPiece() : null;
//
//                // Deep copy the Square and its Piece
//                copiedBoard[i][j] = new Square(j, i,(originalPiece != null) ? originalPiece.copy() : null);
//                
//            }
//        }
         
        
        return new Momento(copiedBoard,movments);
    }

   
    
    public void switchPlayer() {
        currentPlayer = (currentPlayer == ChessEnums.Color.White) ? ChessEnums.Color.Black : ChessEnums.Color.White;
    }
    
    
     public boolean isValidMove(Square startnum, Square endnum)
    {
       
        
        Square[][] board1=board.getBoard();
         Piece piece = startnum.getPiece();
        
            if (piece == null) {
               return false; 
              }
        boolean x=startnum.getPiece().isValidMove(startnum, endnum);
       // System.out.println("2-"+x);
        if(!protectking(startnum.getPiece().getColor(),startnum,endnum))
        return false;
        
       
        else
        if(x==false&&startnum.getPiece().getPieceName()==ChessEnums.PieceName.King)
        { 
         boolean b= iscastling(board1,startnum,endnum);
            System.out.println("the answer is" +b);
            
           
            
           return  b;
        }
        
         if(x==true&&startnum.getPiece() instanceof Pawn)
         { 
             
               Pawn p=(Pawn)piece;
               if(p.getCheck()==1)
               {   
                   Piece p1=p.getneighbourleft(board1, startnum, endnum);
               Piece p2=p.getneighbourright(board1, startnum, endnum);
               if((p1 instanceof Pawn&&p1.getColor()!=piece.getColor())||(p2 instanceof Pawn&&p2.getColor()!=piece.getColor()))
               {  
                   p.setFlag(1);
                   
               }
               }
         }
         
       
        if(x==false&&startnum.getPiece() instanceof Pawn&&movments.isB()==true)
        {       System.out.println("enpasaant 7t7sl isa");
            Pawn p=(Pawn)piece;
            
           boolean y= p.checkenpassant(board1, startnum, endnum);
           
           movments.setInpassantdone(y);
           return y;
        }
   
        if(x)
        {
            if (piece instanceof Rook || piece instanceof Bishop || piece instanceof Queen||piece instanceof Pawn) {
                {boolean z= piece.isPathClear(board1, startnum, endnum);
                   
                    
                return z;
                }
                
               }
              else 
            { 
                  return true;
            }
        }
        return false;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
     
     public boolean protectking(ChessEnums.Color color,Square startnum,Square endnum)
     { if(startnum.getPiece()!=null)
      {Piece piece=endnum.getPiece();
          endnum.setPiece(startnum.getPiece());
       startnum.setPiece(null);
          if(isInCheck(color))
          {   startnum.setPiece(endnum.getPiece());
              endnum.setPiece(piece);
              
              return false;
          }
          startnum.setPiece(endnum.getPiece());
              endnum.setPiece(piece);
              movments.setCheckhappened(false);
              return true;
                            }
       return false;
         
     }
     
      public boolean isValidSquare(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
    
     public boolean iscastling(Square[][]board,Square start,Square end)
     {
        int startRow = start.getRow();
        int endRow = end.getRow();
        int endCol = end.getColumn();
        int checkCol1=endCol+1;
        int checkCol2=endCol-2;
        if(isValidSquare(startRow,checkCol1)&&isValidSquare(startRow,checkCol2))  // 3shan mfesh haga bara elarray
               
        if(start.getPiece().getColor()==ChessEnums.Color.White)
        {
            if(!this.isInCheck(ChessEnums.Color.White))
            {   if(board[endRow][endCol+1].getPiece()!=null)
               {
                   if(board[endRow][endCol+1].getPiece().getPieceName()==ChessEnums.PieceName.Rook&&board[endRow][endCol+1].getPiece().getColor()==ChessEnums.Color.White)
            {
                if(!start.getPiece().hasMoved()&&!board[endRow][endCol+1].getPiece().hasMoved())//m3mlsh move abl keda
                { 
                    if(board[endRow][endCol].getPiece()==null&&board[endRow][endCol-1].getPiece()==null)// el path fady bta3o
                    {   Square squarestartrook=board[endRow][endCol+1];
                        Square squareendrook=board[endRow][endCol-1];
                        //this.move(squareNotation(squarestartrook), squareNotation(squareendrook));
                        System.out.println("Castle");
                        //switchPlayer();
                        return true;
                    }
                        
                }
            }
               }
                else if(board[endRow][endCol-2].getPiece()!=null)
                if(board[endRow][endCol-2].getPiece().getPieceName()==ChessEnums.PieceName.Rook&&board[endRow][endCol-2].getPiece().getColor()==ChessEnums.Color.White)
                        
                    
                { 
                    if(!start.getPiece().hasMoved()&&!board[endRow][endCol-2].getPiece().hasMoved())
                { 
                    if(board[endRow][endCol].getPiece()==null&&board[endRow][endCol-1].getPiece()==null&&board[startRow][endCol+1].getPiece()==null)
                    {   Square squarestartrook=board[endRow][endCol-2];
                        Square squareendrook=board[endRow][endCol+1];
                        //this.move(squareNotation(squarestartrook), squareNotation(squareendrook));
                        System.out.println("Castle");
                       // switchPlayer();
                        return true;
                    }
                        
                }
                }
        }
        }
        else{
            {
            if(!this.isInCheck(ChessEnums.Color.Black))
            {   if(board[endRow][endCol+1].getPiece()!=null)
               {
                   if(board[endRow][endCol+1].getPiece().getPieceName()==ChessEnums.PieceName.Rook&&board[endRow][endCol+1].getPiece().getColor()==ChessEnums.Color.Black)
            {
                if(!start.getPiece().hasMoved()&&!board[endRow][endCol+1].getPiece().hasMoved())
                { 
                    if(board[endRow][endCol].getPiece()==null&&board[endRow][endCol-1].getPiece()==null)
                    {   Square squarestartrook=board[endRow][endCol+1];
                        Square squareendrook=board[endRow][endCol-1];
                       // this.move(squareNotation(squarestartrook), squareNotation(squareendrook));
                        System.out.println("Castle");
                        //switchPlayer();
                        return true;
                    }
                        
                }
            }
               }
                else if(board[endRow][endCol-2].getPiece()!=null)
                if(board[endRow][endCol-2].getPiece().getPieceName()==ChessEnums.PieceName.Rook&&board[endRow][endCol-2].getPiece().getColor()==ChessEnums.Color.Black)
                        
                    
                { 
                    if(!start.getPiece().hasMoved()&&!board[endRow][endCol-2].getPiece().hasMoved())
                { 
                    if(board[endRow][endCol].getPiece()==null&&board[endRow][endCol-1].getPiece()==null&&board[endRow][endCol+1].getPiece()==null)
                    {   Square squarestartrook=board[endRow][endCol-2];
                        Square squareendrook=board[endRow][endCol+1];
                        //this.move(squareNotation(squarestartrook), squareNotation(squareendrook));
                        System.out.println("Castle");
                        //switchPlayer();
                        return true;
                    }
                        
                }
                }
        }
        }
        }
            
        
            return false;
        
     }
     public boolean iscastle(Square[][]board1,Square start,Square end)
     {
        int startRow = start.getRow();
        int endRow = end.getRow();
        int endCol = end.getColumn();
        int checkCol1=endCol+1;
        int checkCol2=endCol-2;
        if(isValidSquare(startRow,checkCol1)&&isValidSquare(startRow,checkCol2))  // 3shan mfesh haga bara elarray
               
        if(start.getPiece().getColor()==ChessEnums.Color.White)
        {
            if(!this.isInCheck(ChessEnums.Color.White))
            {   if(board1[endRow][endCol+1].getPiece()!=null)
               {
                   if(board1[endRow][endCol+1].getPiece().getPieceName()==ChessEnums.PieceName.Rook&&board1[endRow][endCol+1].getPiece().getColor()==ChessEnums.Color.White)
            {
                if(!start.getPiece().hasMoved()&&!board1[endRow][endCol+1].getPiece().hasMoved())//m3mlsh move abl keda
                { 
                    if(board1[endRow][endCol].getPiece()==null&&board1[endRow][endCol-1].getPiece()==null)// el path fady bta3o
                    {   
                        Square squarestartrook=board1[endRow][endCol+1];
                        Square squareendrook=board1[endRow][endCol-1];
                        rookcastlestart=squareNotation(squarestartrook);
                        rookcastleend=squareNotation(squareendrook);
                        this.move(squareNotation(squarestartrook), squareNotation(squareendrook));
                        caretaker.pop();
                        
                        System.out.println("Castle");
                         movments.setCastling(true);
                        switchPlayer();
                       
                        
                        return true;
                    }
                        
                }
            }
               }
                else if(board1[endRow][endCol-2].getPiece()!=null)
                if(board1[endRow][endCol-2].getPiece().getPieceName()==ChessEnums.PieceName.Rook&&board1[endRow][endCol-2].getPiece().getColor()==ChessEnums.Color.White)
                        
                    
                { 
                    if(!start.getPiece().hasMoved()&&!board1[endRow][endCol-2].getPiece().hasMoved())
                { 
                    if(board1[endRow][endCol].getPiece()==null&&board1[endRow][endCol-1].getPiece()==null&&board1[startRow][endCol+1].getPiece()==null)
                    {   Square squarestartrook=board1[endRow][endCol-2];
                        Square squareendrook=board1[endRow][endCol+1];
                        rookcastlestart=squareNotation(squarestartrook);
                        rookcastleend=squareNotation(squareendrook);
                        this.move(squareNotation(squarestartrook), squareNotation(squareendrook));
                          caretaker.pop();
                       
                        System.out.println("Castle");
                        movments.setCastling(true);
                        switchPlayer();
                        return true;
                    }
                        
                }
                }
        }
        }
        else{
            {
            if(!this.isInCheck(ChessEnums.Color.Black))
            {   if(board1[endRow][endCol+1].getPiece()!=null)
               {
                   if(board1[endRow][endCol+1].getPiece().getPieceName()==ChessEnums.PieceName.Rook&&board1[endRow][endCol+1].getPiece().getColor()==ChessEnums.Color.Black)
            {
                if(!start.getPiece().hasMoved()&&!board1[endRow][endCol+1].getPiece().hasMoved())
                { 
                    if(board1[endRow][endCol].getPiece()==null&&board1[endRow][endCol-1].getPiece()==null)
                    {   Square squarestartrook=board1[endRow][endCol+1];
                        Square squareendrook=board1[endRow][endCol-1];
                        rookcastlestart=squareNotation(squarestartrook);
                        rookcastleend=squareNotation(squareendrook);
                        this.move(squareNotation(squarestartrook), squareNotation(squareendrook));
                          caretaker.pop();
                        System.out.println("Castle");
                        movments.setCastling(true);
                        switchPlayer();
                        return true;
                    }
                        
                }
            }
               }
                else if(board1[endRow][endCol-2].getPiece()!=null)
                if(board1[endRow][endCol-2].getPiece().getPieceName()==ChessEnums.PieceName.Rook&&board1[endRow][endCol-2].getPiece().getColor()==ChessEnums.Color.Black)
                        
                    
                { 
                    if(!start.getPiece().hasMoved()&&!board1[endRow][endCol-2].getPiece().hasMoved())
                { 
                    if(board1[endRow][endCol].getPiece()==null&&board1[endRow][endCol-1].getPiece()==null&&board1[endRow][endCol+1].getPiece()==null)
                    {   Square squarestartrook=board1[endRow][endCol-2];
                        Square squareendrook=board1[endRow][endCol+1];
                        rookcastlestart=squareNotation(squarestartrook);
                        rookcastleend=squareNotation(squareendrook);
                        this.move(squareNotation(squarestartrook), squareNotation(squareendrook));
                           caretaker.pop();
                        System.out.println("Castle");
                        movments.setCastling(true);
                        switchPlayer();
                        return true;
                    }
                        
                }
                }
        }
        }
        }  
            return false;
     }
     
      public Square stringChange(String ff) 
    {
    int coloumn = ff.charAt(0) - 'a';
    int row = Character.getNumericValue(ff.charAt(1)) - 1;

    if (board.isValidSquare(row,coloumn)) {
        return board.getSquare(row,coloumn);
    } else {
        return null; 
        }
    }
      
//    public void copyboard() 
//    {
//    Square[][] copyboardSquares = copyboard.getCopyBoard();
//    for (int row = 0; row < 8; row++) {
//        for (int col = 0; col < 8; col++) {
//            Square originalSquare = board.getSquare(row, col);
//            Piece originalPiece = originalSquare.getPiece();
//            if (originalPiece != null) {
//                Piece copiedPiece = originalPiece.copy();
//                if (copiedPiece == null) {
//                    if (originalPiece instanceof Pawn) {
//                        copiedPiece = new Pawn(originalPiece.getColor());
//                    } else if (originalPiece instanceof Rook) {
//                        copiedPiece = new Rook(originalPiece.getColor());
//                    } else if (originalPiece instanceof Knight) {
//                        copiedPiece = new Knight(originalPiece.getColor());
//                    } else if (originalPiece instanceof Bishop) {
//                        copiedPiece = new Bishop(originalPiece.getColor());
//                    } else if (originalPiece instanceof Queen) {
//                        copiedPiece = new Queen(originalPiece.getColor());
//                    } else if (originalPiece instanceof King) {
//                        copiedPiece = new King(originalPiece.getColor());
//                    }
//                }
//                copyboardSquares[row][col].setPiece(copiedPiece);
//            }
//        }
//    }   
//    //copyboard.setCurrentPlayer(board.getCurrentPlayer());
//    boardStack.push(copyboard);
//}
            
//    public void undoLastMove() 
//{
//    if (!boardStack.isEmpty()) 
//    {
//        EmptyBoard previousBoard = boardStack.pop();
//        board.setBoard(previousBoard.getCopyBoard());
//        System.out.println("inside undo");
//        viewCopiedBoard();
//    } else 
//    {
//        System.out.println("Cannot undo further. Stack is empty.");
//    }
//}
 
      
      
//      public void undoLastMove() {
//        Square[][] previousBoardState = emptyBoard.undoLastMove();
//        if (previousBoardState != null) {
//            // Restore the game state to the previous state
//            board.setBoard(previousBoardState);
//            viewBoard();  // Display the board after the undo
//        } else {
//            System.out.println("Cannot undo further. Stack is empty.");
//        }
//    }
//    
    
    public boolean move(String startSquare, String endSquare) {
    Square start = stringChange(startSquare);
    Square end = stringChange(endSquare);
    
//    if (isFirstMove) {
//            // Save the initial state of the board before the first move
//           caretaker.push(saveBoardState(board.getBoard()));
//            isFirstMove = false;  // Set isFirstMove to false after saving the initial state
//        }
    
    Square[][] board2=board.getBoard();
    movments.setCastling(false);
    
    if (start.getPiece() != null && start.getPiece().getColor() != currentPlayer) {
        System.out.println("Invalid move1");////////////////////// player switcher
        return false;
    }
     if(movments.isGameend()==true)
     {  System.out.println("Game already ended");
         return false;
     }
     else
    if (isValidMove(start, end)) {
         boardcopy=(Board)board.clone();
        caretaker.push(saveBoardState(boardcopy.getBoard(),movments)); 
         if(start.getPiece().getPieceName()==ChessEnums.PieceName.King)
             iscastle(board2,start,end);
        Piece movedPiece = start.getPiece();
        
        Piece capturedPiece = end.getPiece();
        

        end.setPiece(movedPiece);
        start.setPiece(null);
        
        movedPiece.sethasMoved(true);
        
        
            String capturedPieceName = getCapturedPieceName(capturedPiece);// end
            if(capturedPieceName!=null){
            System.out.println("Captured " + capturedPieceName);
            }
            if(movments.isInpassantdone()&&end.getPiece().getColor()==ChessEnums.Color.Black)
            {  
                  int endRow = end.getRow();
                   int endCol = end.getColumn();
                   if(isValidSquare(endRow+1,endCol ))
                   { Square[][] board1=board.getBoard();
                     Piece piece=board1[endRow+1][endCol].getPiece();
                     System.out.println("Enpassant");
                     System.out.println("Captured "+getCapturedPieceName(piece));
                     capturedrow=endRow+1;
                     capturedcol=endCol;
                     
                      captured=  squareNotation (board.getSquare(capturedrow,capturedcol));
                       System.out.println("the nameee"+captured);
                     remove(endRow+1,endCol);
                    
                      
                     movments.setInpassantdone(false);
                     movments.setFinallydone(true);
                   }

            }
            if(movments.isInpassantdone()&&end.getPiece().getColor()==ChessEnums.Color.White)
            {  
              
                  int endRow = end.getRow();
                   int endCol = end.getColumn();   
                   Square[][] board1=board.getBoard();
                   if(isValidSquare(endRow-1,endCol ))
                   {
                      Piece piece=board1[endRow-1][endCol].getPiece();
                      System.out.println("Enpassant");
                      System.out.println("Captured "+getCapturedPieceName(piece));
                       capturedrow=endRow-1;
                     capturedcol=endCol;
                       captured=  squareNotation (board.getSquare(capturedrow,capturedcol));
                       System.out.println("the nameeee"+captured);
                      remove(endRow-1,endCol);
                   
                  
                     movments.setInpassantdone(false);
                       movments.setFinallydone(true);
                   }
 
            }
            if(end.getPiece() instanceof Pawn)
            {
                Pawn pawn=(Pawn)end.getPiece();
                if(pawn.getFlag()==1)
                { 
                    movments.setB(true);
                    
                }
                else
                {movments.setB(false);
                  
                }
                
            }
            else
                movments.setB(false);
                 
            ChessEnums.Color opponentColor;
           if (currentPlayer == ChessEnums.Color.White) {
           opponentColor = ChessEnums.Color.Black;
           }
           else 
           {
            opponentColor = ChessEnums.Color.White;
           }
           
            if(isInCheck(opponentColor))
            {
                if(isCheckmate(opponentColor))
                {    movments.setWinningcolor(this.getCurrentPlayer());
                    movments.setGameend(true);
                   
                }
                    else
                    System.out.println(opponentColor + " in check");
                
            }
           stalemate(opponentColor);
           switchPlayer();
           
           if (isInsufficientMaterial()) {
             System.out.println("Insufficient Material");
             movments.setGameend(true);  /////////////////////////////////  for ending the game and not makeing any more moves
             return false; 
             } 
           
         
        return true;
     } else {
        System.out.println("Invalid move2");
        return false;
    }
}
    
    
   
    
    public boolean stalemate(ChessEnums.Color color)
    {
        if(isInCheck(color))
            return false;
        
          for (int startRow = 0; startRow < 8; startRow++) {
        for (int startCol = 0; startCol < 8; startCol++) {
            Square start = board.getSquare(startRow, startCol);
            Piece piece = start.getPiece();

            if (piece != null && piece.getColor() == color) {
                for (int endRow = 0; endRow < 8; endRow++) {
                    for (int endCol = 0; endCol < 8; endCol++) {
                        Square end = board.getSquare(endRow, endCol);

                        if (isValidMove(start, end)) {
                            // Try the move
                            Piece movedPiece = start.getPiece();
                            Piece capturedPiece = end.getPiece();
                            end.setPiece(movedPiece);
                            start.setPiece(null);
                            //movedPiece.sethasMoved(true);/////////hena ya ahmedddd

                            // Check if the move eliminates the check
                            if (!isInCheck(color)) {
                                // Undo the move
                                end.setPiece(capturedPiece);
                                start.setPiece(movedPiece);
                                movedPiece.sethasMoved(movedPiece.hasMoved());

                                return false; // Check is not mate
                            }

                            // Undo the move
                            end.setPiece(capturedPiece);
                            start.setPiece(movedPiece);
                            movedPiece.sethasMoved(movedPiece.hasMoved());
                        }
                    }
                }
            }
        }
    }
        System.out.println("Stalemate");
        movments.setGameend(true);  //  for ending the game and not makeing any more moves
        movments.setStallmate(true);
        return true;
    }
    
    public boolean isCheckmate(ChessEnums.Color color) {
 
    if (!isInCheck(color)) {
        return false;
    }

    // Check if there are any valid moves to escape check
    for (int startRow = 0; startRow < 8; startRow++) {
        for (int startCol = 0; startCol < 8; startCol++) {
            Square start = board.getSquare(startRow, startCol);
            Piece piece = start.getPiece();

            if (piece != null && piece.getColor() == color) {
                for (int endRow = 0; endRow < 8; endRow++) {
                    for (int endCol = 0; endCol < 8; endCol++) {
                        Square end = board.getSquare(endRow, endCol);

                        if (isValidMove(start, end)) {
                            // Try the move
                            Piece movedPiece = start.getPiece();
                            Piece capturedPiece = end.getPiece();
                            end.setPiece(movedPiece);
                            start.setPiece(null);
                            ///movedPiece.sethasMoved(true);//henaaaa ya ahmeddddd

                            // Check if the move eliminates the check
                            if (!isInCheck(color)) {
                                // Undo the move
                                end.setPiece(capturedPiece);
                                start.setPiece(movedPiece);
                                movedPiece.sethasMoved(movedPiece.hasMoved());

                                return false; // Check is not mate
                            }

                            // Undo the move
                            end.setPiece(capturedPiece);
                            start.setPiece(movedPiece);
                            movedPiece.sethasMoved(movedPiece.hasMoved());
                        }
                    }
                }
            }
        }
    }

    // If no valid move can escape check, it's checkmate
    if (color == ChessEnums.Color.White) {
        
        System.out.println("Black Won");
    } else {
        System.out.println("White Won");
    }

    return true;
}
  
        
    public void remove(int row, int coloumn)
    { 
       Square[][] board1= board.getBoard();
       
       
       board1[row][coloumn].setPiece(null);
    }
    
    public String getCapturedPieceName(Piece capturedPiece) {
    if (capturedPiece != null) {       
        ChessEnums.PieceName piecename = capturedPiece.getPieceName();
        return piecename.name();
    } else {
        return null;
    }
    }


    public List<String> getAllValidMovesFromSquare(String squareName) {
    Square start = stringChange(squareName);

    if (start.isEmpty()|| start.getPiece().getColor() != currentPlayer) {         ////       
     
        return new ArrayList<>();
    }

    List<String> validMoves = new ArrayList<>();

    for (int row = 0; row < 8; row++) {
        for (int col = 0; col < 8; col++) {
            Square end = board.getSquare(row, col);
            if (isValidMove(start, end)) {
                validMoves.add(squareNotation(end));
            }
        }
    }
    return validMoves;
}


//    public String squareNotation(Square square) {
//    char col = (char) ('a' + square.getColumn());
//    int row = square.getRow() + 1;
//    return String.valueOf(col) + row;
//}
    
    public String squareNotation(Square square) {
    if(square!=null){//////////////////////////////////////////////
    char col = (char) ('a' + square.getColumn());
    int row = square.getRow() + 1;
    return String.valueOf(col) + row;
    }
    else return null;/////////////////////////////////////////////
}

    public boolean isInCheck(ChessEnums.Color color) 
    {
    Square kingSquare = findKing(color);
    if (kingSquare != null) 
    {
        for (int row = 0; row < 8; row++) 
        {
            for (int col = 0; col < 8; col++) 
            {
                Square end = board.getSquare(row, col);// loop 3la el squares we lw 3leeh 7aga a4oof 7rakat el gwha
                if (end.getPiece() != null && end.getPiece().getColor() != color) 
                {
                    if (end.getPiece().isValidMove(end, kingSquare)&&end.getPiece().isPathClear(board.getBoard(), end,kingSquare)) 
                    { movments.setCheckhappened(true);
                        return true;
                    }
                }
            }
        }
    }
    
    return false;
    }

    
    public Square findKing(ChessEnums.Color color) 
    {
    for (int row = 0; row < 8; row++) {
        for (int col = 0; col < 8; col++) {
            Square square = board.getSquare(row, col);
            Piece kingpiece = square.getPiece();
            if (kingpiece instanceof King && kingpiece.getColor() == color) {
                return square;
            }
        }
    }
    return null;
    }
    public Square[][] rotateboard()
    {    Square[][] squares2=new  Square[8][8];
         Square[][] squares = board.getBoard();
         for (int row = 0; row < 8; row++)
             for (int col = 0; col < 8; col++)
             {
               squares2[7-row][col] = squares[row][col];
             }
         return squares2;
        
    }

//    public void viewCopiedBoard() {
//    Square[][] copiedSquares = copyboard.getCopyBoard();
//    System.out.println("   a  b  c  d  e  f  g  h");
//
//    for (int row = 0; row < 8; row++) {
//        System.out.print((row + 1) + "| ");
//        for (int col = 0; col < 8; col++) {
//            Piece piece = copiedSquares[row][col].getPiece();
//            if (piece != null) {
//                System.out.print(piece.getColor().name().charAt(0)); // First letter of color
//                System.out.print(piece.getPieceName().name().charAt(0) + " "); // First letter of piece name
//            } else {
//                System.out.print(".  ");
//            }
//        }
//        System.out.println();
//    }
//}
    
    
//    
          public Square[][] undoLastMove() {
       Momento momento =caretaker.pop();
        Square[][] previousBoardState =momento.getBoard();
     
        if (previousBoardState != null) {
            // Restore the game state to the previous state
             
              
             
              switchPlayer();
              
            board.setBoard(previousBoardState);
            if(momento.getMovments().isB()==false)
               movments.setB(true);
            return previousBoardState;
            
              // Display the board after the undo
        } else {
            System.out.println("Cannot undo further. Stack is empty.");
            return new Square[8][8];
        }
    }
    
    
//    public Square[][] undoLastMove() {
//        
//    if (!caretaker.getBoardStack().isEmpty()) /////////////////////////////////////
//    {    
//        Square[][] previousBoardState = caretaker.pop().getBoard();
//         Momento momento =caretaker.pop();
//        if (previousBoardState != null) 
//        {
//            switchPlayer();
//            board.setBoard(previousBoardState);
//            if(momento.getMovments().isB()==false)
//            {  movments.setB(true);
//           
//            return previousBoardState;
//            }
//            
//           else
//           return previousBoardState;
//        }    
//    }
//    else 
//    {
//        System.out.println("Cannot undo further. Stack is empty.");
//    }
//    return new Square[8][8];
//}
    
    public void viewBoard() {       // temp board for testing
    Square[][] squares = board.getBoard();

    System.out.println("   a  b  c  d  e  f  g  h");
   

    for (int row = 0; row < 8; row++) {
        System.out.print((row + 1) + "| ");
        for (int col = 0; col < 8; col++) {
            Piece piece = squares[row][col].getPiece();
            if (piece != null) {
                System.out.print(piece.getColor().name().charAt(0)); // First letter of color
                System.out.print(piece.getPieceName().name().charAt(0) + " "); // First letter of piece name
            } else {
                System.out.print(".  ");
            }
        }
        System.out.println();
    }
}
    public void viewBoard2() {       // temp board for testing
    Square[][] squares = rotateboard();

    System.out.println("   a  b  c  d  e  f  g  h");
   

    for (int row = 0; row < 8; row++) {
        System.out.print((row + 1) + "| ");
        for (int col = 0; col < 8; col++) {
            Piece piece = squares[row][col].getPiece();
            if (piece != null) {
                System.out.print(piece.getColor().name().charAt(0)); // First letter of color
                System.out.print(piece.getPieceName().name().charAt(0) + " "); // First letter of piece name
            } else {
                System.out.print(".  ");
            }
        }
        System.out.println();
    }
}

//    public boolean promotePawn(String startSquare, String endSquare, String promoteTo) {
//    Square start = stringChange(startSquare);
//    Square end = stringChange(endSquare);
//
//  
//    if (start != null && end != null && start.getPiece() instanceof Pawn) {
//        Pawn pawn = (Pawn) start.getPiece();
//        int endRow = end.getRow();
//
//      
//        if ((pawn.getColor() == ChessEnums.Color.White && endRow == 7) ||
//            (pawn.getColor() == ChessEnums.Color.Black && endRow == 0)) {
//            
//             Piece capturedPiece = end.getPiece();
//           
//            switch (promoteTo) {
//                case "K":
//                    end.setPiece(new Knight(pawn.getColor()));
//                    break;
//                case "B":
//                    end.setPiece(new Bishop(pawn.getColor()));
//                    break;
//                case "R":
//                    end.setPiece(new Rook(pawn.getColor()));
//                    break;
//                case "Q":
//                    end.setPiece(new Queen(pawn.getColor()));
//                    break;
//                default:
//                    System.out.println("Invalid promotion choice");
//                    return false;
//            }
//              
//            if (capturedPiece != null) {
//                String capturedPieceName = getCapturedPieceName(capturedPiece);
//                System.out.println("Captured " + capturedPieceName);
//            }
//               
//            start.setPiece(null);
//            end.getPiece().sethasMoved(true);
//           
//            ChessEnums.Color opponentColor;
//           if (currentPlayer == ChessEnums.Color.White) {
//           opponentColor = ChessEnums.Color.Black;
//           }
//           else 
//           {
//            opponentColor = ChessEnums.Color.White;
//           }
//           
//            if(isInCheck(opponentColor))
//            {
//                if(isCheckmate(opponentColor))
//                {    movments.setGameend(true);
//                   
//                }
//                    else
//                    System.out.println(opponentColor + " in check");
//                
//            }
//            switchPlayer();
//
//            return true;
//        } else {
//            System.out.println("Pawn cannot be promoted at the current destination");
//        }
//    } else {
//        System.out.println("Invalid start square or pawn not found");
//    }
//    return false;
//}
    
    
    public boolean promotePawn(String startSquare, String endSquare, String promoteTo) {
    Square start = stringChange(startSquare);
    Square end = stringChange(endSquare);
   System.out.println("Start Square: " + startSquare);
   System.out.println("End Square: " + endSquare);
   System.out.println("Start Piece: " + start.getPiece());
    
   if (end != null && end.getPiece() instanceof Pawn) {
        System.out.println("Start Square: " + start);
        System.out.println("End Square: " + end);
        System.out.println("Start Piece: " + start.getPiece());
        Pawn pawn = (Pawn) end.getPiece();
        int endRow = end.getRow();

      
        if ((pawn.getColor() == ChessEnums.Color.White && endRow == 7) ||
            (pawn.getColor() == ChessEnums.Color.Black && endRow == 0)) {
            System.out.println("Pawn Color: " + pawn.getColor());
            System.out.println("End Row: " + endRow);
             Piece capturedPiece = end.getPiece();
           
            switch (promoteTo) {
                case "K":
                    //end.setPiece(new Knight(pawn.getColor(),end.getPiece().getName()));
                    end.setPiece(PieceFactory.createPiece(pawn.getColor(), ChessEnums.PieceName.knight, end.getPiece().getName()));
                    break;
                case "B":
                   //end.setPiece(new Bishop(pawn.getColor(),end.getPiece().getName()));
                    end.setPiece(PieceFactory.createPiece(pawn.getColor(), ChessEnums.PieceName.Bishop, end.getPiece().getName()));
                    break;
                case "R":
                    //end.setPiece(new Rook(pawn.getColor(),end.getPiece().getName()));
                    end.setPiece(PieceFactory.createPiece(pawn.getColor(), ChessEnums.PieceName.Rook, end.getPiece().getName()));
                    break;
                case "Q":
                    //end.setPiece(PieceFactory.createPiece(pawn.getColor(), ChessEnums.PieceName.Queen, end.getPiece().getName()));
                    end.setPiece(new Queen(pawn.getColor(),end.getPiece().getName()));
                    break;
                default:
                    System.out.println("Invalid promotion choice");
                    return false;
            }
              
            if (capturedPiece != null) {
                String capturedPieceName = getCapturedPieceName(capturedPiece);
                System.out.println("Captured " + capturedPieceName);
            }
               
            start.setPiece(null);
            end.getPiece().sethasMoved(true);
           
            ChessEnums.Color opponentColor;
           if (currentPlayer == ChessEnums.Color.White) {
           opponentColor = ChessEnums.Color.Black;
           }
           else 
           {
            opponentColor = ChessEnums.Color.White;
           }
           
            if(isInCheck(opponentColor))
            {
                if(isCheckmate(opponentColor))
                {    movments.setGameend(true);
                   
                }
                    else
                    System.out.println(opponentColor + " in check");
                
            }
            switchPlayer();
            switchPlayer();

            return true;
        } else {
            System.out.println("Pawn cannot be promoted at the current destination");
        }
    } else {
        System.out.println("Invalid start square or pawn not found");
    }
    return false;
}

    public boolean isInsufficientMaterial() {
   
    int totalWhitePieces = countPieces(ChessEnums.Color.White);
    int totalBlackPieces = countPieces(ChessEnums.Color.Black);
    
    boolean insufficientMaterialCondition =
        (totalWhitePieces == 1 && totalBlackPieces == 1) || // king vs king
        (totalWhitePieces == 1 && totalBlackPieces == 2 && containsKnight(ChessEnums.Color.Black))||//kings vs 1 black knight
        (totalWhitePieces == 2 && totalBlackPieces == 1 && containsKnight(ChessEnums.Color.White))||//kings vs 1 white knight
        (totalWhitePieces == 1 && totalBlackPieces == 2 && containsBishop(ChessEnums.Color.Black))||//kings vs 1 black bishop
        (totalWhitePieces == 2 && totalBlackPieces == 1 && containsBishop(ChessEnums.Color.White))||//kings vs 1 white bishop
        (totalWhitePieces == 1 && totalBlackPieces == 3 && containsKnight(ChessEnums.Color.Black))||// lone king and king and 2 black knights
        (totalWhitePieces == 3 && totalBlackPieces == 1 && containsKnight(ChessEnums.Color.White));// lone king and king and 2 white knights
   
    return insufficientMaterialCondition;
}


    private int countPieces(ChessEnums.Color color) {
    
    Square[][] board =this.board.getBoard();
    int count = 0;
    for (int row = 0; row < 8; row++) {
        for (int col = 0; col < 8; col++) {
            if (board[row][col].getPiece() != null && board[row][col].getPiece().getColor() == color) {
                count++;
            }
        }
    }
    return count;
}

    private boolean containsKnight(ChessEnums.Color color) {
 
    Square[][] board = this.board.getBoard();
    for (int row = 0; row < 8; row++) {
        for (int col = 0; col < 8; col++) {
            Piece piece = board[row][col].getPiece();
            if (piece != null && piece.getColor() == color && piece instanceof Knight) {
                return true;
            }
        }
    }
    return false;
}


    private boolean containsBishop(ChessEnums.Color color) {
 
    Square[][] board = this.board.getBoard();
    for (int row = 0; row < 8; row++) {
        for (int col = 0; col < 8; col++) {
            Piece piece = board[row][col].getPiece();
            if (piece != null && piece.getColor() == color && piece instanceof Bishop) {
                return true;
            }
        }
    }
    
    
    return false;
}
    
    
    
    
    
    
    public boolean isPawnPromotion(String endSquare) {
    Square end = stringChange(endSquare);
   
    if (end != null && end.getPiece() instanceof Pawn) {
        int endRow = end.getRow();
        ChessEnums.Color pawnColor = end.getPiece().getColor();
        boolean isPromotion = (pawnColor == ChessEnums.Color.White && endRow == 7) ||
                               (pawnColor == ChessEnums.Color.Black && endRow == 0);

        System.out.println("Is pawn promotion? " + isPromotion);
        return isPromotion;
    }

    return false;
}
    

}

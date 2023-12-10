
package ChessCoreOurs;

import ChessCoreOurs.ChessEnums.*;

public class Board implements Clone {
    

    Square[][] board=new Square[8][8];

    public Color getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Color currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
    private ChessEnums.Color currentPlayer;

   

    public Board() {
        initializeBoard();
       
        currentPlayer = Color.White;
        
    }
    
   
     private void initializeBoard() {
        
      
        for (int col = 0; col < 8; col++) {
              //String x = String.valueOf(col + 1);
              int x=col+1;
            //board[1][col] = new Square(col, 1,new Pawn(Color.White,"whitepawn"+x));
            board[1][col] = new Square(col, 1,PieceFactory.createPiece(Color.White,PieceName.Pawn,"whitepawn"+x));
            board[6][col] = new Square(col, 6,PieceFactory.createPiece(Color.Black,PieceName.Pawn,"blackpawn"+x));
            //board[6][col] = new Square(col, 6,new Pawn(Color.Black,"blackpawn"+x));
        }
        
        initializePieces(ChessEnums.Color.White, 0);
        initializePieces(ChessEnums.Color.Black, 7);
    }

     private void initializePieces(Color color, int row) {
         for (int i = 2; i < 6; i++)
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Square(j, i, null);
            }
         if(color==ChessEnums.Color.White)
         {//board[row][0] = new Square(0, row, new Rook(color,"whiteRook1"));
          board[row][0] = new Square(0, row, PieceFactory.createPiece(color, PieceName.Rook,"whiteRook1"));
          board[row][1] = new Square(1, row,PieceFactory.createPiece(color, PieceName.knight,"whiteknight1"));
          board[row][2] = new Square(2, row, PieceFactory.createPiece(color, PieceName.Bishop,"whitebishop1"));
          board[row][3] = new Square(3, row, PieceFactory.createPiece(color, PieceName.Queen,"whitequeen"));
          board[row][4] = new Square(4, row, PieceFactory.createPiece(color, PieceName.King, "whiteking"));
          board[row][5] = new Square(5, row, PieceFactory.createPiece(color, PieceName.Bishop,"whitebishop2"));
          board[row][6] = new Square(6, row, PieceFactory.createPiece(color, PieceName.knight,"whiteknight2"));
          board[row][7] = new Square(7, row,PieceFactory.createPiece(color, PieceName.Rook,"whiteRook2"));
        //board[row][1] = new Square(1, row, new Knight(color,"whiteknight1"));
        //board[row][2] = new Square(2, row, new Bishop(color,"whitebishop1"));
       //board[row][3] = new Square(3, row, new Queen(color,"whitequeen"));
        //board[row][4] = new Square(4, row, new King(color,"whiteking"));
        //board[row][5] = new Square(5, row, new Bishop(color,"whitebishop2"));
        //board[row][6] = new Square(6, row, new Knight(color,"whiteknight2"));
        //board[row][7] = new Square(7, row, new Rook(color,"whiteRook2"));
         }else
         {
        board[row][0] = new Square(0, row, PieceFactory.createPiece(color,PieceName.Rook,"blackRook1"));
        board[row][1] = new Square(1, row,PieceFactory.createPiece(color, PieceName.knight,"blackknight1"));
        board[row][2] = new Square(2, row, PieceFactory.createPiece(color, PieceName.Bishop,"blackbishop1"));
        board[row][3] = new Square(3, row, PieceFactory.createPiece(color, PieceName.Queen,"blackqueen"));
        board[row][4] = new Square(4, row, PieceFactory.createPiece(color, PieceName.King, "blackking"));
        board[row][5] = new Square(5, row, PieceFactory.createPiece(color, PieceName.Bishop,"blackbishop2"));
        board[row][6] = new Square(6, row, PieceFactory.createPiece(color, PieceName.knight,"blackknight2"));
        board[row][7] = new Square(7, row,PieceFactory.createPiece(color, PieceName.Rook,"blackRook2"));
        
        //board[row][0] = new Square(0, row, new Rook(color,"blackRook1"));    
        //board[row][1] = new Square(1, row, new Knight(color,"blackknight1"));
        //board[row][2] = new Square(2, row, new Bishop(color,"blackbishop1"));
        //board[row][3] = new Square(3, row, new Queen(color,"blackqueen"));
        //board[row][4] = new Square(4, row, new King(color,"blackking"));
        //board[row][5] = new Square(5, row, new Bishop(color,"blackbishop2"));
        //board[row][6] = new Square(6, row, new Knight(color,"blackknight2"));
        //board[row][7] = new Square(7, row, new Rook(color,"blackRook2"));
         }
    }

    public Square getSquare(int row, int col) {
        if (isValidSquare(row, col)) {
            
            return board[row][col];
        
        }
        return null;
    }
    
    public boolean isValidSquare(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
    
    public Square[][] getBoard(){
            return board;
    }
    
      public void setBoard(Square[][] newBoard) {
        if (newBoard.length == 8 && newBoard[0].length == 8) {
            for (int i = 0; i < 8; i++) {
                System.arraycopy(newBoard[i], 0, board[i], 0, 8);
            }
             
        }
  
        
    }
      
      private Board(Board board){
        this.board=new Square[8][8]; 
        for(int i=0;i<8;i++)
            for(int j=0;j<8;j++)
            {
                if(board.getSquare(i, j).getPiece()==null)
                    this.board[i][j]=new Square(j,i,null);
                else 
                this.board[i][j]=new Square(j,i,(Piece)board.getSquare(i, j).getPiece().clone());
            }
    }

    @Override
    public Clone clone() {
        return new Board(this);
    }
     

  

    
}

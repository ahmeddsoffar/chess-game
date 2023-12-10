
package ChessCoreOurs;

import ChessCoreOurs.ChessEnums.Color;


public class Queen extends Piece{
    private ChessEnums.PieceName piecename;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Queen(Color color,String name) {
        super(color,name);
        this.piecename = ChessEnums.PieceName.Queen;
        super.setPieceName(piecename);
        this.name=name;
         
    }

    @Override
    public boolean isValidMove( Square start, Square end) {
        int startRow = start.getRow();
        int startCol = start.getColumn();
        int endRow = end.getRow();
        int endCol = end.getColumn();

        int rowDiff = Math.abs(endRow - startRow);
        int colDiff = Math.abs(endCol - startCol);
        if(super.isValidMove(start, end))
        if ((startRow == endRow || startCol == endCol) || (rowDiff == colDiff)) {
            
            return true;
        }
       return false;
    }
   
    @Override
   public Queen copy() {
    
       return new Queen(this.getColor(),this.getName());
}

    @Override
    public Clone clone() {
        Queen copypiece=new Queen(this.getColor(),this.getName());
        copypiece.sethasMoved(this.hasMoved());
        return copypiece;
    }
    
    
    }
    
    
    
    
    
    
    
    
    
    



package ChessCoreOurs;

import ChessCoreOurs.ChessEnums.Color;


public class Bishop extends Piece{
     
    private ChessEnums.PieceName piecename;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public Bishop(Color color,String name) {
        super(color,name);
        this.piecename = ChessEnums.PieceName.Bishop;
        super.setPieceName(piecename);
        this.name=name;
        
    }

    @Override
    public boolean isValidMove( Square start, Square end) {
        int startRow = start.getRow();
        int startCol = start.getColumn();
        int endRow = end.getRow();
        int endCol = end.getColumn();

        
        if(super.isValidMove(start, end))
        if (Math.abs(endRow - startRow) == Math.abs(endCol - startCol)) {          
            return true;
        }
        return false;
    }
    
    @Override
   public Bishop copy() {
    return new Bishop(this.getColor(),this.getName());
}

    @Override
    public Clone clone() {
        Bishop copypiece=new Bishop(this.getColor(),this.getName());
        copypiece.sethasMoved(this.hasMoved());
        return copypiece;
    }
    
}


package ChessCoreOurs;

import ChessCoreOurs.ChessEnums.Color;


public class King extends Piece{
    private ChessEnums.PieceName piecename;
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public King(Color color,String name) {
        super(color,name);
        this.piecename = ChessEnums.PieceName.King;
        super.setPieceName(piecename);
        this.name=name;
        
    }

    @Override
    public boolean isValidMove(Square start, Square end) {
        
        int startRow = start.getRow();
        int startCol = start.getColumn();
        int endRow = end.getRow();
        int endCol = end.getColumn();

        int rowDiff = Math.abs(endRow - startRow);
        int colDiff = Math.abs(endCol - startCol);
        if(super.isValidMove(start, end))
        {  
            boolean b=(rowDiff <= 1 && colDiff <= 1);
        return b;
                }
        else
            return false;
    }
    @Override
   public King copy() {
    King king= new King(this.getColor(),this.getName());
    king.sethasMoved(this.hasMoved());
    return king;
}

    @Override
    public Clone clone() {
         King copypiece=new King(this.getColor(),this.getName());
        copypiece.sethasMoved(this.hasMoved());
        return copypiece;
    }
}

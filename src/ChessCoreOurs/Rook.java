
package ChessCoreOurs;

import ChessCoreOurs.ChessEnums.Color;


public class Rook extends Piece{
      
     private ChessEnums.PieceName piecenmae;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public Rook(Color color,String name) {
        super(color,name);
        this.piecenmae = ChessEnums.PieceName.Rook;
        
        super.setPieceName(piecenmae);
        this.name=name;
        
    }

    @Override
    public boolean isValidMove(Square start, Square end) {
        int startRow = start.getRow();
        int startCol = start.getColumn();
        int endRow = end.getRow();
        int endCol = end.getColumn();

      if(super.isValidMove(start, end))
     if (startRow == endRow || startCol == endCol) {
            return true;
        }

        return false;
    }
    
    @Override
   public Rook copy() {
    Rook rook= new Rook(this.getColor(),this.getName());
    rook.sethasMoved(this.hasMoved());
    return rook;
}

    @Override
    public Clone clone() {
        Rook copypiece=new Rook(this.getColor(),this.getName());
        copypiece.sethasMoved(this.hasMoved());
        return copypiece;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChessCoreOurs;

import ChessCoreOurs.ChessEnums.Color;


public class Knight extends Piece
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private ChessEnums.PieceName piecename;
    
    public Knight(Color color,String name) {
        super(color,name);
        this.piecename = ChessEnums.PieceName.knight;
        super.setPieceName(piecename);
        this.name=name;
         
    }
    
    
    
    @Override
    public boolean isValidMove(Square start, Square end) 
    { if(super.isValidMove(start, end)){
        
        int startRow = start.getRow();
            
        int startCol = start.getColumn();
       
        int endRow = end.getRow();
            
        int endCol = end.getColumn();
     

        int rowDiff = Math.abs(endRow - startRow);
              
        int colDiff = Math.abs(endCol - startCol);


            boolean b= (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
               
                
            
        return b;
    }
        else 
            return false;
    } 
    
    @Override
   public Knight copy() {
    return new Knight(this.getColor(),this.getName());
}

    @Override
    public Clone clone() {
        Knight copypiece=new Knight(this.getColor(),this.getName());
        copypiece.sethasMoved(this.hasMoved());
        return copypiece;
    }
    
    
}

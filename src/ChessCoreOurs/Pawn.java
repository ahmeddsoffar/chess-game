/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChessCoreOurs;

import ChessCoreOurs.ChessEnums.*;


public class Pawn extends Piece{
    int flag;
    int check=0;

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
 private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private ChessEnums.PieceName piecename;
    
    public Pawn(Color color,String name) {
        super(color,name);
        this.piecename = ChessEnums.PieceName.Pawn;
        this.name=name;
        super.setPieceName(piecename);
         
    }


    @Override
    public boolean isValidMove(Square start, Square end) {
        int startRow = start.getRow();
        int startCol = start.getColumn();
        int endRow = end.getRow();
        int endCol = end.getColumn();
        
       
        
        int direction;
          if (getColor() == Color.White) {
            direction = 1;
            } else 
          {
            direction = -1;
          }
          
  
          
        // Moving one square forward
        if (endCol == startCol && endRow == startRow + direction && end.isEmpty()) {
            this.setCheck(0);
            return true;
        }
        



        // Pawn's initial double move
        if (!hasMoved() && endCol == startCol && endRow == startRow + 2 * direction && end.isEmpty()) {
            System.out.println("moved twice");
            this.setCheck(1);
                return true;           
        }
        
        // Pawn capture diagonally
        if (Math.abs(endCol - startCol) == 1 && endRow == startRow + direction) {
            Piece target = end.getPiece();
            if (target != null && target.getColor() != getColor()) {
                return true;
            }
        }

        return false;
    }
   public boolean checkenpassant(Square[][] board,Square start,Square end)
    {     Piece target1;
         Piece target2;
         int endRow = end.getRow();
        int endCol = end.getColumn();
       int newcol1=endCol;
       int newrow1=endRow+1;
       int newrow2=endRow-1;
         if(newrow1>=0&&newrow1<8)
         {
             if(start.getPiece().getColor()==ChessEnums.Color.Black)
             { target1=board[newrow1 ][newcol1].getPiece();
           
          if(target1 instanceof Pawn&&target1!=null&&newrow1-start.getRow()==0)
          {
              Pawn p=(Pawn) target1;
              if(p.getFlag()==1)
              {
                  return true;
              }
              else return false;
          }
             }
         }
         if(newrow2>=0&&newrow2<8)
         {   if(start.getPiece().getColor()==ChessEnums.Color.White)
          {target2=board[newrow2 ][newcol1].getPiece();
             if(target2 instanceof Pawn&&target2!=null&&newrow2-start.getRow()==0)
          { 
              Pawn p=(Pawn) target2;
              if(p.getFlag()==1)
              { 
                  return true;
              }
              else 
                  return false;
          }
          }
         }
          return false;
    }
   public Piece getneighbourleft(Square[][] board,Square start,Square end)
   {int endRow = end.getRow();
     int endCol = end.getColumn();
      int newcol=endCol-1;
      if(newcol<8&&newcol>=0)
     return  board[endRow][newcol].getPiece();
      else return null;
   }
   public Piece getneighbourright(Square[][] board,Square start,Square end)
   {int endRow = end.getRow();
     int endCol = end.getColumn();
        int newcol=endCol+1;
      if(newcol<8&&newcol>=0)
     return  board[endRow][newcol].getPiece();
      else return null;
   }
   
   
   
   
   
   
   
   
    @Override
   public Pawn copy() {
    
            Pawn pawn=new Pawn(this.getColor(),this.getName());
            this.name=name;
            pawn.sethasMoved(this.hasMoved());
//            System.out.println("the has moved isssss"+this.hasMoved());
            pawn.setFlag(this.getFlag());
            pawn.setCheck(this.getCheck());
            return pawn;
}

    @Override
    public Clone clone() {
        Pawn pawn=new Pawn(this.getColor(),this.getName());
            this.name=name;
            pawn.sethasMoved(this.hasMoved());
//            System.out.println("the has moved isssss"+this.hasMoved());
            pawn.setFlag(this.getFlag());
            pawn.setCheck(this.getCheck());
            return pawn;
        
    }

    
   
 
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChessCoreOurs;

import ChessCoreOurs.ChessEnums.*;

/**
 *
 * @author Lenovo-
 */
public abstract class Piece implements Clone
{
    private Board board;
    private final  Color color;
    private boolean hasMoved;
    private ChessEnums.PieceName pieceName;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Piece(Color color,String name) {    
        this.color = color;
        this.hasMoved = false;
        this.name=name;
    }
    
    public void setPieceName(ChessEnums.PieceName pieceType) {
        this.pieceName = pieceType;
    }

    public ChessEnums.PieceName getPieceName() {
        return pieceName;
    }
    
    public abstract Piece copy();
   
    
    public boolean isValidMove(Square start, Square end)
    {

        Piece piecestart =start.getPiece();
       
        Piece pieceend=end.getPiece();
       if (pieceend !=null)
       {  
          if (piecestart.getColor()==pieceend.getColor()){
           
             return false; 
          }
       }
    
       
           return true; 

    }

 public boolean isPathClear(Square[][] board, Square start, Square end) {
        int startRow = start.getRow();
        int startCol = start.getColumn();
        int endRow = end.getRow();
        int endCol = end.getColumn();

        // Check if the move is along the same row
        if (startRow == endRow) {
            int colDirection = Integer.compare(endCol, startCol);
            for (int col = startCol + colDirection; col != endCol; col += colDirection) {
                if (board[startRow][col].getPiece() != null) {
                    return false; // Path is not clear
                }
            }
        }
        // Check if the move is along the same col
        else if (startCol == endCol) {
            int rowDirection = Integer.compare(endRow, startRow);
            for (int row = startRow + rowDirection; row != endRow; row += rowDirection) {
                if (board[row][startCol].getPiece() != null) {
                    return false; // Path is not clear
                }
            }
        }
        // Check if the move is along a diagonal
        else if (Math.abs(endRow - startRow) == Math.abs(endCol - startCol)) {
            int rowDirection = Integer.compare(endRow, startRow);
            int colDirection = Integer.compare(endCol, startCol);
            for (int i = 1; i < Math.abs(endRow - startRow); i++) {
                int row = startRow + i * rowDirection;
                int col = startCol + i * colDirection;
                if (board[row][col].getPiece() != null) {
                    return false; // Path is not clear
                }
            }
        }

        return true; // Path is clear
    }

     public boolean hasMoved() {
        return hasMoved;
    }
    
    public void sethasMoved(boolean moved) {
        this.hasMoved = moved;
    }
     
    public Color getColor() {
        return color;
    }
    
    public void setBoard(Board board) {
        this.board = board;
    }
    
    public Board getBoard() {
        return board;
    }

    @Override
    public  abstract Clone clone(); 
      
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChessCoreOurs;

public class Square {
    private int column;
    private int row;
    private Piece piece;

    public Square(int column, int row, Piece piece) {
        this.column = column;
        this.row = row;
        this.piece = piece;
    }
    
    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    
    public boolean isEmpty() {
     return piece == null;
    }

}

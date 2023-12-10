/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChessCoreOurs;

import java.util.Stack;

/**
 *
 * @author utd
 */
public class Momento {
  private Square[][] board=new Square[8][8];
  private Movment movments=new Movment();

    public Movment getMovments() {
        return movments;
    }

    public void setMovments(Movment movments) {
        this.movments = movments;
    }

    public Square[][] getBoard() {
        return board;
    }

    public void setBoard(Square[][] board) {
        this.board = board;
    }

    public Momento(Square[][] copiedBoard,Movment movments) {
      
        board=copiedBoard;
        this.movments=movments;
        
    }
    

   
     

   
}
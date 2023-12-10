/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChessCoreOurs;

import java.util.Stack;

/**
 *
 * @author Lenovo-
 */
public class CareTaker {
     private Stack<Momento> boardStack=new Stack<>();

   public void push(Momento momento)
   {
       boardStack.add(momento);
   }
   public Momento pop()
   {
       return boardStack.pop();
   }
   public Stack<Momento> getBoardStack() {
        return boardStack;
    }
}

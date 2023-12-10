/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChessCoreOurs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
       
        
        ChessGame ff=new ChessGame();
        
        
        
//    File file = new File("ChessGame.txt");
//    Scanner sc = null;
//    try{
//        sc=new Scanner(file);
//        while(sc.hasNextLine())
//        {
//            String line =sc.nextLine();
//            if(!line.isEmpty())
//            {
//                String[] postion=line.split(",");
//                if(postion.length==2)    // normal move
//                {
//                    String startsquare = postion[0];
//                    String endsquare = postion[1];
//                    ff.move(startsquare,endsquare);
//                    
//                }else  if(postion.length==3)  // promtion move
//                {
//                        String startsquare = postion[0];
//                        String endsquare = postion[1];
//                        String promtionsybole= postion[2];
//                        ff.promotePawn(startsquare, endsquare, promtionsybole);
//                        
//                }else
//                {
//                    System.out.println("Invalid line format in the file");
//                    
//                }
//            }
//        }sc.close();
//       }catch (FileNotFoundException e){
//           System.out.println("file not found");
//       }



       ff.move("b2","b4");
       ff.move("f7","f5");
       ff.move("b4","b5");
       ff.move("c7","c5");
       ff.move("b5","c6");
//       ff.move("a6","b6");
//       ff.move("a5","a6");
//       ff.move("h7","h5");
//       ff.move("a6","a7");
//       ff.move("g7","g5");
//        ff.promotePawn("a7","a8","Q");
//       
       //ff.copyboard();
    
       //System.out.println(ff.getBoard().getSquare(1, 0).getPiece());
      
       ff.undoLastMove();
         ff.move("b5","c6");
       
          
       
      
      // ff.move("e1","g1");
       
       ff.viewBoard();
       //ff.undoLastMove();
        
       //ff.move("b2","b4");
       //System.out.println(ff.getBoard().getSquare(1, 0).getPiece());
       //ff.undoLastMove();
       //ff.move("a7","a5");
       //ff.undoLastMove();
       //ff.move("a2","a4");
       //ff.undoLastMove();
      
       //System.out.println(ff.getBoard().getSquare(1, 0).getPiece());
       //ff.undoLastMove();
       //ff.move("a7","a6");
        //System.out.println(ff.getBoard().getSquare(1, 0).getPiece());
//       ff.move("d7", "d5");
//       ff.move("e4","e5");
//       ff.move("d5", "d3");
        //System.out.println(ff.getBoard().getSquare(7, 0).getPiece().hasMoved()); 
        
        //ff.viewCopiedBoard();
        //ff.viewBoard2();
        //List<String> validMoves = ff.getAllValidMovesFromSquare("a7");///////////////////get all valid moves Test 
        //System.out.println("\nValid moves : " + validMoves+"\n");
    }
}

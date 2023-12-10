/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChessCoreOurs;

import java.util.ArrayList;
import java.util.List;


public class Movment implements ChessObserver{
//    private boolean b;
//   private  boolean inpassantdone;
//    private boolean gameend;
//    private boolean finallydone;
//    
//    private boolean castling;
//    private boolean checkhappened;
//    private ChessEnums.Color winningcolor;
//    private boolean stallmate;
//
//    public boolean isStallmate() {
//        return stallmate;
//    }
//
//    public void setStallmate(boolean stallmate) {
//        this.stallmate = stallmate;
//    }
//
//    public ChessEnums.Color getWinningcolor() {
//        return winningcolor;
//    }
//
//    public void setWinningcolor(ChessEnums.Color winningcolor) {
//        this.winningcolor = winningcolor;
//    }
//
//    public boolean isCheckhappened() {
//        return checkhappened;
//    }
//
//    public void setCheckhappened(boolean checkhappened) {
//        this.checkhappened = checkhappened;
//    }
//
//    public boolean isCastling() {
//        return castling;
//    }
//
//    public void setCastling(boolean castling) {
//        this.castling = castling;
//    }
//
//    public boolean isFinallydone() {
//        return finallydone;
//    }
//
//    public void setFinallydone(boolean finallydone) {
//        this.finallydone = finallydone;
//    }
//
//    public boolean isGameend() {
//        return gameend;
//    }
//
//    public void setGameend(boolean gameend) {
//        this.gameend = gameend;
//    }
//    public boolean isInpassantdone() {
//        return inpassantdone;
//    }
//
//    public void setInpassantdone(boolean inpassantdone) {
//        this.inpassantdone = inpassantdone;
//    }
//
//    public boolean isB() {
//        return b;
//    }
//
//    public void setB(boolean b) {
//        this.b = b;
//    }
    
    
    
     private boolean b;
   private  boolean inpassantdone;
    private boolean gameend;
    private boolean finallydone;
    
    private boolean castling;
    private boolean checkhappened;
    private ChessEnums.Color winningcolor;
    private boolean stallmate;

    
    private List<ChessObserver> observers = new ArrayList<>();


    private void notifyObservers() {
        for (ChessObserver observer : observers) {
            observer.update(this);
        }
    }
    

    @Override
    public void update(Movment aThis) {
         this.setB(aThis.isB());
         this.setInpassantdone(aThis.isInpassantdone());
         this.setGameend(aThis.isGameend());
         notifyObservers();
    }
    
    
    
    
    
    
    
    public boolean isStallmate() {
        return stallmate;
    }

    public void setStallmate(boolean stallmate) {
        this.stallmate = stallmate;
        notifyObservers();
    }

    public ChessEnums.Color getWinningcolor() {
        return winningcolor;
    }

    public void setWinningcolor(ChessEnums.Color winningcolor) {
        this.winningcolor = winningcolor;
        notifyObservers();
    }

    public boolean isCheckhappened() {
        return checkhappened;
    }

    public void setCheckhappened(boolean checkhappened) {
        this.checkhappened = checkhappened;
        notifyObservers();
    }

    public boolean isCastling() {
        return castling;
    }

    public void setCastling(boolean castling) {
        this.castling = castling;
        notifyObservers();
    }

    public boolean isFinallydone() {
        return finallydone;
    }

    public void setFinallydone(boolean finallydone) {
        this.finallydone = finallydone;
        notifyObservers();
    }

    public boolean isGameend() {
        return gameend;
    }

    public void setGameend(boolean gameend) {
        this.gameend = gameend;
        notifyObservers();
    }
    public boolean isInpassantdone() {
        return inpassantdone;
    }

    public void setInpassantdone(boolean inpassantdone) {
        this.inpassantdone = inpassantdone;
        notifyObservers();
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
        notifyObservers();
    }

    
}

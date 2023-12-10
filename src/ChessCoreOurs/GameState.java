/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChessCoreOurs;

/**
 *
 * @author utd
 */

public class GameState {
    private Square[][] boardState;
    private int currentPlayerTurn;  // Use an identifier or flag (e.g., 0 for player 1, 1 for player 2)
    // Add fields for other game state information

    public GameState(Square[][] boardState, int currentPlayerTurn) {
        this.boardState = boardState;
        this.currentPlayerTurn = currentPlayerTurn;
        // Initialize other fields
    }

    public Square[][] getBoardState() {
        return boardState;
    }

    public int getCurrentPlayerTurn() {
        return currentPlayerTurn;
    }

    // Add getters for other state information
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChessCoreOurs;


import ChessCoreOurs.ChessEnums.*;

public class PieceFactory {
    public static Piece createPiece(Color color, ChessEnums.PieceName pieceType, String name) {
        Piece piece;
        switch (pieceType) {
            case Pawn:
                piece = new Pawn(color,name);
                break;
            case Rook:
                piece = new Rook(color,name);
                break;
            case knight:
                piece = new Knight(color,name);
                break;
            case Bishop:
                piece = new Bishop(color,name);
                break;
            case Queen:
                piece = new Queen(color,name);
                break;
            case King:
                piece = new King(color,name);
                break;
            default:
                throw new IllegalArgumentException("Invalid piece type: " + pieceType);
        }
        return piece;
    }
}
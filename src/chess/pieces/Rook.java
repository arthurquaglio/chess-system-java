package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.color;

public class Rook extends ChessPiece {
    public Rook(Board board, chess.color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}

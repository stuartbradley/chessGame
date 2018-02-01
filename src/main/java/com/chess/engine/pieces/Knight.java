package com.chess.engine.pieces;

import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.Move;

import java.util.List;

/**
 * Created by stuart on 01-Feb-18.
 */
public class Knight extends Piece{
    
    Knight(int piecePosition, Alliance pieceAlliance) {
        super(piecePosition, pieceAlliance);
    }

    public List<Move> calculateLegalMoves(Board board) {
        return null;
    }
}

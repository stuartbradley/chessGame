package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

/**
 * Created by stuart on 31-Jan-18.
 */

public abstract class Tile {

    protected final int tileCoordinate;

    Tile(int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

    public static final class EmptyTile extends Tile {
        EmptyTile(int coordinate) {
            super(coordinate);
        }

        @Override
        public boolean isTileOccupied() {
            return false;
        }

        @Override
        public Piece getPiece() {
            return null;
        }

        public static class OccupiedTile extends Tile {
            private final Piece pieceOnTile;

            OccupiedTile(int tileCoordinate, Piece pieceOnTile) {
                super(tileCoordinate);
                this.pieceOnTile = pieceOnTile;
            }

            @Override
            public Piece getPiece() {
                return this.pieceOnTile;
            }

            @Override
            public boolean isTileOccupied() {
                return true;
            }
        }
    }
}






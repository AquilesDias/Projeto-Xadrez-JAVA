package boardgame;

import javax.swing.*;

public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    public Piece PossibleMoves(){}

    public abstract boolean possibleMove(Piece position){}

    public boolean isTherePossibleMove(){}

    protected Board getBoard() {
        return board;
    }

}

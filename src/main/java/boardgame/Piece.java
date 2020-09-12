package boardgame;

public class Piece {  //peça

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

//    public Piece PossibleMoves() {
//    }
//
//    public  boolean possibleMove(Piece position) {
//    }
//
//    public boolean isTherePossibleMove() {
//    }

    protected Board getBoard() {
        return board;
    }

}

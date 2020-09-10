package boardgame;

import javafx.geometry.Pos;

public class Board {

    private Integer rowns;
    private Integer columns;
    private Piece[][] pieces;

    public Board(Integer rowns, Integer columns) {
        this.rowns = rowns;
        this.columns = columns;
        pieces = new Piece[rowns][columns];
    }

    public Piece piece (Integer row, Integer columns){}

    public Piece piece (Position position){}

    public void placePiece (Piece piece, Position position){}

    public Piece removePiece (Position position){}

    public boolean positionExists(Position position){}

    public boolean therelsAPiece(Position position){}

    public Integer getRowns() {
        return rowns;
    }

    public void setRowns(Integer rowns) {
        this.rowns = rowns;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }
}

package chess;

import boardgame.Position;

public class ChessPosition {

    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'A' || column > 'H' || row < 1 || row > 8){
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8"); // Error instanciando ... valores validos sao...
        }
        this.column = column;
        this.row = row;
    }


    protected Position toPosition(){
        return new Position(8-row, column - 'A');
    }

    protected static ChessPosition fromPosition(Position position){
        return  new ChessPosition((char)( 'A' +  position.getColumn()), 8 - position.getRow());
    }

    public String toString(){
        return "" + column + row;
    }


    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

}

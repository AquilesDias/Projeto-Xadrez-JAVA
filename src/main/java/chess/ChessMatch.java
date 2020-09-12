package chess;

import boardgame.Board;

public class ChessMatch { //Partida de Xadrez

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    public ChessPiece [][] getPieces(){
        ChessPiece [][] mat = new ChessPiece[board.getRowns()][board.getColumns()];
        for(int i=0; i<board.getRowns(); i++){
            for(int j=0; j<board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}

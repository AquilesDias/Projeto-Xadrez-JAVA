package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;
import sun.plugin2.util.ColorUtil;

public class ChessMatch { //Partida de Xadrez

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
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

    public void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    public void initialSetup(){
        placeNewPiece('B', 6, new Rook(board, Color.WHITE));
        placeNewPiece('E', 8, new King(board, Color.BLACK));
        placeNewPiece('E', 1, new King(board, Color.WHITE));
    }
}

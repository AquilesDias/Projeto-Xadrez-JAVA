package boardgame;

import javafx.geometry.Pos;

public class Board { //Tabuleiro

    private int rowns;     //Linhas
    private int columns;   //Colunas

    private Piece[][] pieces;

    public Board(int rowns, int columns) {

        if(rowns < 1 || columns < 1){
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column"); // Erro criando tabuleiro, é necessario que haja pelo menos uma coluna e linha
        }

        this.rowns = rowns;
        this.columns = columns;
        pieces = new Piece[rowns][columns];
    }

    public Piece piece (int row, int column){
        if(!positionExists(row, column)){
            throw new BoardException("Position not on the board");
        }

        return pieces[row][column];
    }

    public Piece piece (Position position){
        if(!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        return pieces [position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){  //Colocar peça

        if(thereIsAPiece(position)){
            throw new BoardException("There is already a piece on position: " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public Piece removePiece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Position not on the board");
        }

        if(piece(position) == null){
            return null;
        }

        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }

    public boolean positionExists(int row, int column){//verificando se posição existe
        return row >= 0 && row < rowns && column >=0 && column < columns;
    }

    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){ //Verificando se há uma peça.
        if(!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        return piece(position) != null;
    }


   //getters&Setters
    public int getRowns() {
        return rowns;
    }

    public int getColumns() {
        return columns;
    }
}

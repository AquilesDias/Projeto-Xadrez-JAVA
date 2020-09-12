package boardgame;

public class Position { //Posição

    private Integer row;      //LINHA
    private Integer column;   //COLUNA


    public Position (Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public String toString(){
        return row +", "+ column;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }
}

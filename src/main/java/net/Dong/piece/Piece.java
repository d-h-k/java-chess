package net.Dong.piece;

public class Piece {
    public static final int InitialNumOfPawn = 8;
    private final Color color;

    public enum Color {
        WHITE,
        BLACK;
    }

    private Piece(Color color) {
        this.color = color;
    }

    /*public Piece() {this.color = Color.WHITE;    }
    //public Piece(Color color) {        this.color = color;    }



    */
    public Color getColor() {
        return this.color;
    }

    public String getSymbol() {
        if (this.color == Color.WHITE) {
            return "p";
        }
        return "P";
    }

}

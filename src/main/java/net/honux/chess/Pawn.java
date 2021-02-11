package net.honux.chess;

public class Pawn {
    static final String WHITE_COLOR = "white";
    static final String BLACK_COLOR = "black";

    private String color;

    public Pawn() {
        this(WHITE_COLOR);
    }

    public Pawn(String color) {
        if (!color.equals(WHITE_COLOR) && !color.equals(BLACK_COLOR)) {
            throw new IllegalArgumentException("Pawn color should be 'white' or 'black'!");
        }
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

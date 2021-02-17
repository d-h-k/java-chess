package chess;

import pieces.Pawn;
import pieces.Piece;

import java.util.ArrayList;
import java.util.List;

import static utils.StringUtils.appendNewLine;

public class Board {
    public static final int BOARD_SIZE = 8;
    private static final String BLANK_LINE = "........";
    private final List<Piece> whitePieces = new ArrayList<>();
    private final List<Piece> blackPieces = new ArrayList<>();

    public void addWhite(Piece piece) {
        if (piece.getColor().equals(Piece.WHITE_COLOR)) {
            whitePieces.add(piece);
        }
    }

    public void addBlack(Piece piece) {
        if (piece.getColor().equals(Piece.BLACK_COLOR)) {
            blackPieces.add(piece);
        }
    }

    public int size() {
        return whitePieces.size() + blackPieces.size();
    }

    public Piece findWhite(int index) {
        return whitePieces.get(index);
    }

    public Piece findBlack(int index) {
        return blackPieces.get(index);
    }

    void initialize() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            addWhite(new Pawn(Piece.WHITE_COLOR, Pawn.WHITE_REPRESENTATION));
            addBlack(new Pawn(Piece.BLACK_COLOR, Pawn.BLACK_REPRESENTATION));
        }
    }

    String getWhitePawnsResult() {
        return getPiecesResult(whitePieces);
    }

    String getBlackPawnsResult() {
        return getPiecesResult(blackPieces);
    }

    private String getPiecesResult(List<Piece> pieces) {
        StringBuilder sb = new StringBuilder();
        for (Piece piece : pieces) {
            sb.append(piece.getRepresentation());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(appendNewLine(BLANK_LINE))
                .append(appendNewLine(getBlackPawnsResult()))
                .append(appendNewLine(BLANK_LINE))
                .append(appendNewLine(BLANK_LINE))
                .append(appendNewLine(BLANK_LINE))
                .append(appendNewLine(BLANK_LINE))
                .append(appendNewLine(getBlackPawnsResult()))
                .append(appendNewLine(BLANK_LINE));

        return sb.toString();
    }

}

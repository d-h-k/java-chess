package net.Dong.chess;

import net.Dong.piece.Piece;

import static net.Dong.piece.Piece.Color;

import java.util.List;
import java.util.ArrayList;

public class Board {
    private List<Piece> whitePawn = new ArrayList<>();
    private List<Piece> blackPawn = new ArrayList<>();


    private static final String EMPTYLINE = "........";
    private static final String NEWLINE = System.getProperty("line.separator");


    public void addWhitePawn(Piece pawn) {
        whitePawn.add(pawn);
    }

    public void addBlackPawn(Piece pawn) {
        blackPawn.add(pawn);
    }

    public int size() {
        return whitePawn.size() + blackPawn.size();
    }

    private int whitePawnSize() {
        return whitePawn.size();
    }

    private int blackPawnSize() {
        return blackPawn.size();
    }

    public Piece findWhitePawn(int index) {
        return whitePawn.get(index);
    }

    public Piece findBlackPawn(int index) {
        return blackPawn.get(index);
    }

    public void initialize() {
        addWhitePawn(Piece.InitialNumOfPawn);
        addBlackPawn(Piece.InitialNumOfPawn);
    }

    private void addWhitePawn(int numOfPawn) {
        for (int i = 0; i < numOfPawn; i++) {
            whitePawn.add(new Piece(Color.WHITE));
        }
    }

    private void addBlackPawn(int numOfPawn) {
        for (int i = 0; i < numOfPawn; i++) {
            blackPawn.add(new Piece(Color.BLACK));
        }
    }

    public String getWhitePawnsResult() {
        return getPawnsResult(whitePawn);
    }

    public String getBlackPawnsResult() {
        return getPawnsResult(blackPawn);
    }

    private String getPawnsResult(List<Piece> whatPawn) {
        StringBuilder sb = new StringBuilder();
        for (Piece pawn : whatPawn) {
            sb.append(pawn.getSymbol());
        }
        return sb.toString();
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(EMPTYLINE).append(NEWLINE);
        sb.append(getBlackPawnsResult()).append(NEWLINE);
        sb.append(EMPTYLINE).append(NEWLINE);
        sb.append(EMPTYLINE).append(NEWLINE);
        sb.append(EMPTYLINE).append(NEWLINE);
        sb.append(EMPTYLINE).append(NEWLINE);
        sb.append(getWhitePawnsResult()).append(NEWLINE);
        sb.append(EMPTYLINE).append(NEWLINE);
        return sb.toString();
    }
}

package net.kjk402.chess.chess;

import net.kjk402.chess.pieces.Pawn;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<Pawn> whitePawnList = new ArrayList<>();
    private final List<Pawn> blackPawnList = new ArrayList<>();

    public void addWhitePawn(Pawn pawn) {
        if (pawn.getColor() == "white") {
            whitePawnList.add(pawn);
        }
    }

    public void addBlackPawn(Pawn pawn) {
        if (pawn.getColor() == "black") {
            blackPawnList.add(pawn);
        }
    }

    public int whiteSize() {
        return whitePawnList.size();
    }

    public int blackSize() {
        return blackPawnList.size();
    }

    public Pawn findWhitePawn(int idx) {
        return whitePawnList.get(idx);
    }

    public Pawn findBlackPawn(int idx) {
        return blackPawnList.get(idx);
    }

    public void initialize() {
        for (int i = 0; i < 8; i++) {
            addWhitePawn(new Pawn(Pawn.WHITE, Pawn.WHITE_REPRESENTATION));
            addBlackPawn(new Pawn(Pawn.BLACK, Pawn.BLACK_REPRESENTATION));
        }
    }

    public String getWhitePawnsResult() {
        return getPawnsResult(whitePawnList);
    }

    public String getBlackPawnsResult() {
        return getPawnsResult(blackPawnList);
    }

    private String getPawnsResult(List<Pawn> pawns) {
        StringBuilder sb = new StringBuilder();
        for (Pawn pawn : pawns) {
            sb.append(pawn.getRepresentation());
        }
        return sb.toString();
    }

    protected void print() {
        StringBuilder boardOutput = new StringBuilder();
        boardOutput.append("........\n");
        boardOutput.append(getBlackPawnsResult() + "\n");
        boardOutput.append("........\n");
        boardOutput.append("........\n");
        boardOutput.append("........\n");
        boardOutput.append("........\n");
        boardOutput.append(getWhitePawnsResult() + "\n");
        boardOutput.append("........\n");
        System.out.println(boardOutput.toString());
    }

}

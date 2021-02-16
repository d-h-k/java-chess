package net.honux.chess;

import net.honux.chess.pieces.Pawn;

import java.util.ArrayList;

public class Board {

    ArrayList<Pawn> whitePawns = new ArrayList<Pawn>();
    ArrayList<Pawn> blackPawns = new ArrayList<Pawn>();


    public void whitePawnsAdd(Pawn pawn){
        whitePawns.add(pawn);
    }

    public void blackPawnsAdd(Pawn pawn){
        blackPawns.add(pawn);
    }

    public int size() {
        return whitePawns.size()+blackPawns.size();
    }

    public Pawn findWhitePawn(int index) {
        return whitePawns.get(index);
    }

    public Pawn findBlackPawn(int index) {
        return blackPawns.get(index);
    }

    public void initialize() {
        int boardSize = 8;

        for (int i = 1; i <= boardSize; i++) {
            whitePawnsAdd(new Pawn(Pawn.WHITE_COLOR,Pawn.WHITE_REPRESENTATION));
            blackPawnsAdd(new Pawn(Pawn.BLACK_COLOR,Pawn.BLACK_REPRESENTATION));
        }

    }

    public String getWhitePawnsResult() {
        StringBuilder whiteResult = new StringBuilder();

        for (Pawn whitePawn : whitePawns){
            whiteResult.append(whitePawn.getRepresentation());
        }
        return whiteResult.toString();

    }

    public String getBlackPawnsResult() {
        StringBuilder blackResult = new StringBuilder();

        for (Pawn blackPawn : blackPawns){
            blackResult.append(blackPawn.getRepresentation());
        }
        return blackResult.toString();
    }



}

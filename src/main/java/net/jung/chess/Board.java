package net.jung.chess;

import net.jung.chess.pieces.Pawn;

import java.util.*;

public class Board {
    private List<Pawn> pawnList = new ArrayList();

    public void add(Pawn pawn) {
        pawnList.add(pawn);
    }

    public int size(){
        return pawnList.size();
    }

    public Pawn findPawn(int index){
        return pawnList.get(index);
    }


}

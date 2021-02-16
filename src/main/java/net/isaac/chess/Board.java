package net.isaac.chess;

import net.isaac.pieces.Pawn;
import net.isaac.pieces.Piece;
import net.isaac.pieces.PieceColor;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private static final int MAX_SIZE = 8;
    private static final int MAX_IDX = MAX_SIZE - 1;

    private Piece[][] pieces = new Piece[MAX_SIZE][MAX_SIZE];
    private List<Piece> whitePieces = new ArrayList<>();
    private List<Piece> blackPieces = new ArrayList<>();

    public void initialize(){
        for(int i = 0; i < MAX_SIZE; i++){
            add(new Pawn(PieceColor.BLACK),1,i);
            add(new Pawn(PieceColor.WHITE), MAX_IDX-1, i);
        }
    }

    public void print(){
        for(int i = 0; i < MAX_SIZE; i++) {
            for(int j = 0; j < MAX_SIZE; j++) {
                if(pieces[i][j] == null)
                    System.out.print('.');
                else
                    System.out.print(pieces[i][j].getRepresentation());
            }
            System.out.println();
        }
    }
    
    public String getWhitePiecesResult(){
        return this.whitePieces.stream().
                map(x->String.valueOf(x.getRepresentation())).
                reduce("",(a,b) -> a+b);
    }

    public String getBlackPiecesResult(){
        return this.blackPieces.stream().
                map(x->String.valueOf(x.getRepresentation())).
                reduce("",(a,b) -> a+b);
    }

    public boolean add(Piece piece, int rowIdx, int colIdx){
        if(!isValid(rowIdx) || !isValid(colIdx))
            return false;

        pieces[rowIdx][colIdx] = piece;

        if(piece.getColor() == PieceColor.BLACK)
            blackPieces.add(piece);
        else if(piece.getColor() == PieceColor.WHITE)
            whitePieces.add(piece);

        return true;
    }

    public Piece findPiece(int rowIdx, int colIdx){
        if(!isValid(rowIdx) || !isValid(colIdx))
            return null;

        return pieces[rowIdx][colIdx];
    }

    private boolean isValid(int location){
        if(location < 0 || MAX_SIZE <= location)
            return false;
        else
            return true;
    }

    public int size(){
        return MAX_SIZE*MAX_SIZE;
    }
}

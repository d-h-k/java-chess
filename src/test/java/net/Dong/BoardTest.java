package net.Dong;

import net.Dong.chess.Board;
import org.junit.jupiter.api.BeforeEach;
import net.Dong.piece.Piece;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import net.Dong.piece.Piece.*;


class BoardTest {
    private Board board;

    @BeforeEach
    public void setup() {
        board = new Board();
    }

    @Test
    @DisplayName("pawn create test")
    void BoardPawnCreate() {
        Board board = new Board();

        Piece white = new Piece(Color.WHITE);
        board.addWhitePawn(white);
        assertThat(board.size()).isEqualTo(1);
        assertThat(board.findWhitePawn(0)).isEqualTo(white);

        Piece black = new Piece(Color.BLACK);
        board.addBlackPawn(black);
        assertThat(board.size()).isEqualTo(2);
        assertThat(board.findBlackPawn(0)).isEqualTo(black);
    }
    void addBlackPawnToBoard(Board board, Pawn pawn, int sizeOfAllPawns, int indexOfPawn) {
        board.addBlackPawn(pawn);
        assertThat(board.size()).isEqualTo(sizeOfAllPawns);
        assertThat(board.findBlackPawn(indexOfPawn)).isEqualTo(pawn);
    }




    @Test
    @DisplayName("board initialize Test")
    void boardInitializeTest() {
        String initBoard =
                "........" + System.lineSeparator() +
                        "PPPPPPPP" + System.lineSeparator() +
                        "........" + System.lineSeparator() +
                        "........" + System.lineSeparator() +
                        "........" + System.lineSeparator() +
                        "........" + System.lineSeparator() +
                        "pppppppp" + System.lineSeparator() +
                        "........"+ System.lineSeparator() ;

        board.initialize();
        assertThat(board.getWhitePawnsResult()).isEqualTo("pppppppp");
        assertThat(board.getBlackPawnsResult()).isEqualTo("PPPPPPPP");
        assertThat(initBoard).isEqualTo(board.print());
    }

}

package net.Dong;

import net.Dong.chess.Board;
import net.Dong.chess.Pawn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static net.Dong.chess.Board.NEW_LINE;
import static net.Dong.chess.Board.EMPTY_LINE;
import static org.assertj.core.api.Assertions.assertThat;

import net.Dong.chess.Pawn.*;


class BoardTest {
    private Board board;

    @BeforeEach
    public void setup() {
        board = new Board();
    }

    @Test
    void createPawnTest() {

        Pawn white1 = new Pawn(Color.WHITE);
        Pawn black1 = new Pawn(Color.BLACK);
        int indexOfPawn = 0;
        addWhitePawnToBoard(board,white1,indexOfPawn);
        addBlackPawnToBoard(board,black1,indexOfPawn);

        Pawn white2 = new Pawn(Color.WHITE);
        Pawn black2 = new Pawn(Color.BLACK);
        indexOfPawn = 1;
        addWhitePawnToBoard(board,white2,indexOfPawn);
        addBlackPawnToBoard(board,black2,indexOfPawn);

        Pawn white3 = new Pawn(Color.WHITE);
        Pawn black3 = new Pawn(Color.BLACK);
        indexOfPawn = 2;
        addWhitePawnToBoard(board,white3,indexOfPawn);
        addBlackPawnToBoard(board,black3,indexOfPawn);
    }
    void addWhitePawnToBoard(Board board, Pawn pawn, int indexOfPawn) {
        board.addWhitePawn(pawn);
        assertThat(board.findWhitePawn(indexOfPawn)).isEqualTo(pawn);
    }
    void addBlackPawnToBoard(Board board, Pawn pawn, int indexOfPawn) {
        board.addBlackPawn(pawn);
        assertThat(board.findBlackPawn(indexOfPawn)).isEqualTo(pawn);
    }




    @Test
    void boardInitializeTest() {
        String expectedString =
                "........" + NEW_LINE +
                        "PPPPPPPP" + NEW_LINE +
                        EMPTY_LINE + NEW_LINE +
                        EMPTY_LINE + NEW_LINE +
                        EMPTY_LINE + NEW_LINE +
                        EMPTY_LINE + NEW_LINE +
                        "pppppppp" + NEW_LINE +
                        EMPTY_LINE + NEW_LINE ;

        board.initialize();
        assertThat(board.getWhitePawnsResult()).isEqualTo("pppppppp");
        assertThat(board.getBlackPawnsResult()).isEqualTo("PPPPPPPP");
        assertThat(board.LayoutToString()).isEqualTo(expectedString);
    }

}

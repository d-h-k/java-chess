package net.Dong;

import net.Dong.chess.Board;
import net.Dong.chess.Pawn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static net.Dong.chess.Board.NEW_LINE;
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
        Pawn white = new Pawn(Color.WHITE);
        Pawn black = new Pawn(Color.BLACK);
        addWhitePawnToBoard(board,white,0);
        addBlackPawnToBoard(board,black,0);
        addWhitePawnToBoard(board,white,1);
        addBlackPawnToBoard(board,black,1);
        addWhitePawnToBoard(board,white,2);
        addBlackPawnToBoard(board,black,2);
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
                        "........" + NEW_LINE +
                        "........" + NEW_LINE +
                        "........" + NEW_LINE +
                        "........" + NEW_LINE +
                        "pppppppp" + NEW_LINE +
                        "........"+ NEW_LINE ;

        board.initialize();
        assertThat(board.getWhitePawnsResult()).isEqualTo("pppppppp");
        assertThat(board.getBlackPawnsResult()).isEqualTo("PPPPPPPP");
        assertThat(board.LayoutToString()).isEqualTo(expectedString);
    }

}

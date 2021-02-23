package net.Dong;

import net.Dong.chess.Board;
import net.Dong.piece.Piece;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import net.Dong.piece.Piece.*;


class BoardTest {


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


    @Test
    @DisplayName("board initialize test")
    void boardInitialize() {
        Board board = new Board();
        board.initialize();
        assertThat(board.getWhitePawnsResult()).isEqualTo("pppppppp");
        assertThat(board.getBlackPawnsResult()).isEqualTo("PPPPPPPP");
    }
}

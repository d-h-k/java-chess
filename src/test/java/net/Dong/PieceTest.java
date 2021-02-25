package net.Dong;

import net.Dong.piece.Piece;
import net.Dong.piece.Piece.Color;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PieceTest {

    @Test
    @DisplayName("Pawn Color Test")
    void PawnCreate() {
        verifyPawnColor(Color.WHITE);
        verifyPawnColor(Color.BLACK);
    }

    void verifyPawnColor(Color color) {
        Piece pawn = new Piece(color);
        assertThat(pawn.getColor()).isEqualTo(color);
    }
}

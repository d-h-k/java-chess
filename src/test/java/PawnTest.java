import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class PawnTest {

    @Test
    @DisplayName("흰색 폰이 생성되어야 한다")
    public void create() {
        Pawn pawn = new Pawn(Colors.WHITE);
        verifyPawn(pawn, Colors.WHITE);
    }
    public void verifyPawn(Pawn pawn, Colors color){
        assertThat(pawn.getColor()).isEqualTo(color);
    }
}
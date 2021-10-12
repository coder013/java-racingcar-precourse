package racinggame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

@DisplayName("우승자 모델에 대한 단위 테스트")
public class WinnerTest {

    @Test
    @DisplayName("우승자 이름이 null인 경우에 대한 테스트")
    void is_winner_name_null_test() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Winner(null));
    }

    @Test
    @DisplayName("우승자 이름이 공백인 경우에 대한 테스트")
    void is_winner_name_blank_test() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Winner(""));
    }
}

package racinggame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

@DisplayName("실행 횟수 모델에 대한 단위 테스트")
public class TotalTryTest {

    @Test
    @DisplayName("실행 횟수가 0인 경우에 대한 테스트")
    void is_total_try_zero_test() {
        assertThatIllegalArgumentException().isThrownBy(() -> new TotalTry(0));
    }

    @Test
    @DisplayName("실행 횟수가 음수인 경우에 대한 테스트")
    void is_total_try_negative_test() {
        assertThatIllegalArgumentException().isThrownBy(() -> new TotalTry(-123456789));
    }
}

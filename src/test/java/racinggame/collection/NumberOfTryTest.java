package racinggame.collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

@DisplayName("실행 횟수 컬렉션에 대한 단위 테스트")
public class NumberOfTryTest {

    @Test
    @DisplayName("실행 횟수가 0인 경우에 대한 테스트")
    void is_number_of_try_zero_test() {
        assertThatIllegalArgumentException().isThrownBy(() -> new NumberOfTry(0));
    }

    @Test
    @DisplayName("실행 횟수가 음수인 경우에 대한 테스트")
    void is_number_of_try_negative_test() {
        assertThatIllegalArgumentException().isThrownBy(() -> new NumberOfTry(-123456789));
    }
}

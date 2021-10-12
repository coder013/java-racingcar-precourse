package racinggame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

@DisplayName("자동차 모델에 대한 단위 테스트")
public class CarTest {

    @Test
    @DisplayName("자동차 이름이 null인 경우에 대한 테스트")
    void is_car_name_null_test() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Car(null));
    }

    @Test
    @DisplayName("자동차 이름이 공백인 경우에 대한 테스트")
    void is_car_name_blank_test() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Car(""));
    }
}

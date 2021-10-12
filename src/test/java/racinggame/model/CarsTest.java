package racinggame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

@DisplayName("자동차 목록 모델에 대한 단위 테스트")
public class CarsTest {

    @Test
    @DisplayName("자동차 목록이 null인 경우에 대한 테스트")
    void is_car_list_null_test() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Cars(null));
    }

    @Test
    @DisplayName("자동차 목록의 크기가 0인 경우에 대한 테스트")
    void is_car_list_size_zero_test() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Cars(new ArrayList<>()));
    }

    @Test
    @DisplayName("자동차가 null인 경우에 대한 테스트")
    void is_car_null_test() {
        List<Car> carList = new ArrayList<>();
        carList.add(null);

        assertThatIllegalArgumentException().isThrownBy(() -> new Cars(carList));
    }
}

package racinggame.collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

@DisplayName("자동차 컬렉션에 대한 단위 테스트")
public class CarsTest {

    @Test
    @DisplayName("자동차 이름이 null인 경우에 대한 테스트")
    void is_car_name_null_test() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(null));

        assertThatIllegalArgumentException().isThrownBy(() -> new Cars(carList));
    }

    @Test
    @DisplayName("자동차 이름이 공백인 경우에 대한 테스트")
    void is_car_name_blank_test() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(""));

        assertThatIllegalArgumentException().isThrownBy(() -> new Cars(carList));
    }
}

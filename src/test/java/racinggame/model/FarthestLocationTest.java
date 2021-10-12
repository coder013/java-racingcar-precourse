package racinggame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("가장 먼 위치 모델에 대한 단위 테스트")
public class FarthestLocationTest {

    @Test
    @DisplayName("위치를 변경하는 경우에 대한 테스트")
    void when_change_value_test() {
        FarthestLocation farthestLocation = new FarthestLocation();
        farthestLocation.changeValue(10);
        assertThat(farthestLocation.getValue()).isEqualTo(10);
    }
}

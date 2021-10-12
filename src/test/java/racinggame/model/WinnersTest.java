package racinggame.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

@DisplayName("우승자 목록 모델에 대한 단위 테스트")
public class WinnersTest {

    @Test
    @DisplayName("우승자 목록이 null인 경우에 대한 테스트")
    void is_winner_list_null_test() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Winners(null));
    }

    @Test
    @DisplayName("우승자 목록의 크기가 0인 경우에 대한 테스트")
    void is_winner_list_size_zero_test() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Winners(new ArrayList<>()));
    }

    @Test
    @DisplayName("우승자가 null인 경우에 대한 테스트")
    void is_winner_null_test() {
        List<Winner> winnerList = new ArrayList<>();
        winnerList.add(null);

        assertThatIllegalArgumentException().isThrownBy(() -> new Winners(winnerList));
    }
}

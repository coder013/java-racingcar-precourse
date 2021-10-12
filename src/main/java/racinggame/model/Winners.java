package racinggame.model;

import racinggame.enums.MessageEnum;

import java.util.List;

public class Winners {

    private final List<Winner> winnerList;

    public Winners(List<Winner> winnerList) {
        validateNull(winnerList);
        validateSize(winnerList);
        this.winnerList = winnerList;
    }

    public List<Winner> getWinnerList() {
        return winnerList;
    }

    private void validateNull(List<Winner> winnerList) {
        if (winnerList == null) {
            throw new IllegalArgumentException(MessageEnum.ERROR_MESSAGE_WHEN_WINNER_NAME_IS_NULL.getValue());
        }

        for (Winner winner : winnerList) {
            validateNull(winner);
        }
    }

    private void validateNull(Winner winner) {
        if (winner == null) {
            throw new IllegalArgumentException(MessageEnum.ERROR_MESSAGE_WHEN_WINNER_NAME_IS_NULL.getValue());
        }
    }

    private void validateSize(List<Winner> winnerList) {
        if (winnerList.size() == 0) {
            throw new IllegalArgumentException(MessageEnum.ERROR_MESSAGE_WHEN_WINNER_NAME_IS_NULL.getValue());
        }
    }
}

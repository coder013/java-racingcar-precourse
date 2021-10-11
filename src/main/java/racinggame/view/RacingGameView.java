package racinggame.view;

import racinggame.enums.MessageEnum;

public class RacingGameView {

    public void printMessageWhenInputCarName() {
        System.out.println(MessageEnum.MESSAGE_WHEN_INPUT_CAR_NAME.getValue());
    }

    public void printMessageWhenInputNumberOfCount() {
        System.out.println(MessageEnum.MESSAGE_WHEN_INPUT_NUMBER_OF_TRY.getValue());
    }

    public void printErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }
}

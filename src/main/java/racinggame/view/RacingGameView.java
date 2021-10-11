package racinggame.view;

import racinggame.model.Car;
import racinggame.model.CurrentTry;
import racinggame.enums.MessageEnum;

public class RacingGameView {

    public void printMessageWhenInputCarName() {
        System.out.println(MessageEnum.MESSAGE_WHEN_INPUT_CAR_NAME.getValue());
    }

    public void printMessageWhenInputTotalTry() {
        System.out.println(MessageEnum.MESSAGE_WHEN_INPUT_TOTAL_TRY.getValue());
    }

    public void printMessageWhenRaceStart(CurrentTry currentTry) {
        System.out.println(currentTry.getValue() + MessageEnum.MESSAGE_WHEN_RACE_START.getValue());
    }

    public void printMessageWhenRacing(Car car) {
        StringBuilder location = new StringBuilder();
        for (int i = 0; i< car.getLocation(); i++) {
            location.append("-");
        }
        System.out.println(car.getName() + " : " + location);
    }

    public void printMessageWhenRaceEnd() {
    }

    public void printErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }
}

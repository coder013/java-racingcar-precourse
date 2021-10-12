package racinggame.controller;

import nextstep.utils.Console;
import racinggame.model.*;
import racinggame.enums.MessageEnum;
import racinggame.view.RacingGameView;

import java.util.ArrayList;
import java.util.List;

public class RacingGameCtrl {

    private final RacingGameView racingGameView;

    public RacingGameCtrl() {
        racingGameView = new RacingGameView();
    }

    public void play() {
        racingGameView.printMessageWhenInputCarName();
        Cars cars = getCars();
        racingGameView.printMessageWhenInputTotalTry();
        TotalTry totalTry = getTotalTry();
        start(cars, totalTry);
        end();
    }

    private void start(Cars cars, TotalTry totalTry) {
        for (int currentTry = 1; currentTry <= totalTry.getValue(); currentTry++) {
            racingGameView.printMessageWhenRaceStart(new CurrentTry(currentTry));
            race(cars);
        }
    }

    private void end() {
        racingGameView.printMessageWhenRaceEnd();
    }

    private void race(Cars cars) {
        for (Car car : cars.getCarList()) {
            car.move();
            racingGameView.printMessageWhenRacing(car);
        }
    }

    private Cars getCars() {
        Cars cars;

        try {
            cars = new Cars(getCarList());
        } catch (IllegalArgumentException e) {
            racingGameView.printErrorMessage(e.getMessage());
            cars = getCars();
        }

        return cars;
    }

    private List<Car> getCarList() {
        String userInput = getUserInput();
        String[] names = userInput.split(",");
        List<Car> carList = new ArrayList<>();

        for (String name : names) {
            carList.add(new Car(name.trim()));
        }

        return carList;
    }

    private TotalTry getTotalTry() {
        TotalTry totalTry;

        try {
            totalTry = new TotalTry(Integer.parseInt(getUserInput()));
        } catch (IllegalArgumentException e) {
            racingGameView.printErrorMessage(MessageEnum.ERROR_MESSAGE_WHEN_NOT_NUMBER.getValue());
            totalTry = getTotalTry();
        }

        return totalTry;
    }

    private String getUserInput() {
        return Console.readLine();
    }
}

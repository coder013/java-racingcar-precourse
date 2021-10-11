package racinggame.controller;

import nextstep.utils.Console;
import racinggame.collection.Cars;
import racinggame.collection.Car;
import racinggame.collection.NumberOfTry;
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
        racingGameView.printMessageWhenInputNumberOfCount();
        NumberOfTry numberOfTry = getNumberOfTry();

        List<Car> carList = cars.getCarList();

        for (Car car : carList) {
            System.out.println(car.getName());
        }

        System.out.println(numberOfTry.getValue());
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
            carList.add(new Car(name));
        }

        return carList;
    }

    private NumberOfTry getNumberOfTry() {
        NumberOfTry numberOfTry;

        try {
            numberOfTry = new NumberOfTry(Integer.parseInt(getUserInput()));
        } catch (Exception e) {
            racingGameView.printErrorMessage(MessageEnum.ERROR_MESSAGE_WHEN_NOT_NUMBER.getValue());
            numberOfTry = getNumberOfTry();
        }

        return numberOfTry;
    }

    private String getUserInput() {
        return Console.readLine();
    }
}

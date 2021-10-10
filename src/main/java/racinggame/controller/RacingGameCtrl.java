package racinggame.controller;

import nextstep.utils.Console;
import racinggame.collection.Cars;
import racinggame.collection.Car;

import java.util.ArrayList;
import java.util.List;

public class RacingGameCtrl {

    public void play() {
        Cars cars = new Cars(getCarList());
        List<Car> carList = cars.getCarList();

        for (Car car : carList) {
            System.out.println(car.getName());
        }
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

    private String getUserInput() {
        return Console.readLine();
    }
}

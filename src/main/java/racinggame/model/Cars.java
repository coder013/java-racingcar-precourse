package racinggame.model;

import racinggame.enums.MessageEnum;

import java.util.List;

public class Cars {

    private final List<Car> carList;

    public Cars(List<Car> carList) {
        validateNull(carList);
        validateDuplicate(carList);
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    private void validateNull(List<Car> carList) {
        if (carList == null || carList.size() == 0) {
            throw new IllegalArgumentException(MessageEnum.ERROR_MESSAGE_WHEN_NAME_IS_NULL.getValue());
        }

        for (Car car : carList) {
            validateNull(car);
        }
    }

    private void validateNull(Car car) {
        if (car == null || car.getName() == null || car.getName().equals("")) {
            throw new IllegalArgumentException(MessageEnum.ERROR_MESSAGE_WHEN_NAME_IS_NULL.getValue());
        }
    }

    private void validateDuplicate(List<Car> carList) {
        for (int i = 0; i < carList.size(); i++) {
            validateDuplicate(carList, i);
        }
    }

    private void validateDuplicate(List<Car> carList, int i) {
        for (int j = 0; j < i; j++) {
            validateDuplicate(carList, i, j);
        }
    }

    private void validateDuplicate(List<Car> carList, int i, int j) {
        if (carList.get(i).getName().equals(carList.get(j).getName())) {
            throw new IllegalArgumentException(MessageEnum.ERROR_MESSAGE_WHEN_NAME_IS_DUPLICATE.getValue());
        }
    }
}

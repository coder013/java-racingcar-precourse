package racinggame.collection;

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
        for (Car car : carList) {
            validateNull(car);
        }
    }

    private void validateNull(Car car) {
        if (car.getName() == null || car.getName().equals("")) {
            throw new IllegalArgumentException("[ERROR] 이름이 공백입니다. 다시 입력해주세요.");
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
            throw new IllegalArgumentException("[ERROR] 이름이 중복되었습니다. 다시 입력해주세요.");
        }
    }
}

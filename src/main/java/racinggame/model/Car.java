package racinggame.model;

import nextstep.utils.Randoms;
import racinggame.enums.RuleEnum;

public class Car {

    private final String name;
    private int location;

    public Car(String name) {
        this.name = name;
        location = 0;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public void move() {
        int number = Randoms.pickNumberInRange(RuleEnum.START_RANGE.getValue(), RuleEnum.END_RANGE.getValue());

        if (number >= RuleEnum.MOVE_CONDITION.getValue()) {
            location++;
        }
    }
}

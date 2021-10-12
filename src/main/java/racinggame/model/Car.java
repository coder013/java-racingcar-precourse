package racinggame.model;

import nextstep.utils.Randoms;
import racinggame.enums.MessageEnum;
import racinggame.enums.RuleEnum;

public class Car {

    private final String name;
    private int location;

    public Car(String name) {
        validateNull(name);
        validateSize(name);
        this.name = name;
        location = 0;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    private void validateNull(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException(MessageEnum.ERROR_MESSAGE_WHEN_NAME_IS_NULL.getValue());
        }
    }

    private void validateSize(String name) {
        if (name.length() > RuleEnum.NAME_SIZE.getValue()) {
            throw new IllegalArgumentException(MessageEnum.ERROR_MESSAGE_WHEN_NAME_SIZE_OVER.getValue());
        }
    }

    public void move() {
        int number = Randoms.pickNumberInRange(RuleEnum.START_RANGE.getValue(), RuleEnum.END_RANGE.getValue());

        if (number >= RuleEnum.MOVE_CONDITION.getValue()) {
            location++;
        }
    }
}

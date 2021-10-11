package racinggame.enums;

public enum RuleEnum {
    START_RANGE(0),
    END_RANGE(9),
    MOVE_CONDITION(4);

    private final int value;

    RuleEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

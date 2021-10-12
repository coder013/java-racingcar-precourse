package racinggame.model;

import racinggame.enums.MessageEnum;

public class Winner {

    private final String name;

    public Winner(String name) {
        validateNull(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validateNull(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException(MessageEnum.ERROR_MESSAGE_WHEN_WINNER_NAME_IS_NULL.getValue());
        }
    }
}

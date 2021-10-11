package racinggame.model;

public class TotalTry {

    private final int value;

    public TotalTry(int value) {
        validateNumber(value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    private void validateNumber(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException();
        }
    }
}

package racinggame.collection;

public class NumberOfTry {

    private final int value;

    public NumberOfTry(int value) {
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

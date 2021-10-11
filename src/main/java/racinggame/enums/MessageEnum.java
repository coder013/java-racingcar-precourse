package racinggame.enums;

public enum MessageEnum {
    MESSAGE_WHEN_INPUT_CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    MESSAGE_WHEN_INPUT_NUMBER_OF_TRY("시도할 횟수는 몇 회인가요?"),
    ERROR_MESSAGE_WHEN_NAME_IS_NULL("[ERROR] 이름이 공백입니다. 다시 입력해주세요."),
    ERROR_MESSAGE_WHEN_NAME_IS_DUPLICATE("[ERROR] 이름이 중복되었습니다. 다시 입력해주세요."),
    ERROR_MESSAGE_WHEN_NOT_NUMBER("[ERROR] 유효하지 않은 숫자입니다. 다시 입력해주세요.");

    private final String value;

    MessageEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

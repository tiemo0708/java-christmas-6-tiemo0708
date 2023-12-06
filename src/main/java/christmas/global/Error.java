package christmas.global;

public enum Error {
    INVALID_DATE("유효하지 않은 날짜입니다. 다시 입력해 주세요."),
    INVALID_ORDER("유효하지 않은 주문입니다. 다시 입력해 주세요."),
    BLANK("빈 값은 입력할 수 없습니다. 다시 입력해 주세요.");;
    private static final String ERROR = "[ERROR] ";
    private final String message;
    Error(String message) {

        this.message = ERROR+message;
    }
    public String getMessage() {
        return message;
    }
}


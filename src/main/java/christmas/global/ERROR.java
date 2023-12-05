package christmas.global;

public enum ERROR {
    INVALID_DATE("유효하지 않은 날짜입니다. 다시 입력해 주세요.");
    private static final String ERROR = "[ERROR] ";
    private final String message;
    ERROR(String message) {

        this.message = ERROR+message;
    }
    public String getMessage() {
        return message;
    }
}


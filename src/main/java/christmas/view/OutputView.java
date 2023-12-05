package christmas.view;

public class OutputView {
    private static final String WELCOME_MESSAGE = "안녕하세요! 우테코 식당 %d월 이벤트 플래너입니다.";
    private static final int MONTH=12;

    public static void printError(Exception e) {
        System.out.println(e.getMessage());
    }

    public static void welcomMessage(){
        System.out.printf(WELCOME_MESSAGE,MONTH);
    }


}

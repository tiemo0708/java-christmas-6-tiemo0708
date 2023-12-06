package christmas.view;

public class OutputView {
    private static final String WELCOME_MESSAGE = "안녕하세요! 우테코 식당 %d월 이벤트 플래너입니다.";
    private static final String DATE_MESSAGE = "%d월 %d에 우테코 식당에서 받을 이벤트 혜택 미리보기%n";
    private static final int MONTH=12;

    public static void printError(Exception e) {
        System.out.println(e.getMessage());
    }

    public static void welcomMessage(){
        System.out.printf(WELCOME_MESSAGE,MONTH);
    }


    public static void printDate(int visitDate) {
        System.out.printf(DATE_MESSAGE,MONTH,visitDate);
    }
}

package christmas.view;

import christmas.domain.model.Menu;

import java.text.NumberFormat;
import java.util.List;

public class OutputView {
    private static final String WELCOME_MESSAGE = "안녕하세요! 우테코 식당 %d월 이벤트 플래너입니다.";
    private static final String DATE_MESSAGE = "%d월 %d에 우테코 식당에서 받을 이벤트 혜택 미리보기!%n%n";
    private static final String ORDER_MENU_MESSAGE = "<주문 메뉴>";
    private static final String ORDER_MENU = "%s %s개%n";
    private static final String AFTER_DISCOUNT_MESSAGE="%n<할인 전 총주문 금액>%n";
    private static final String AFTER_DISCOUNT="%s원%n%n";
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

    public static void printMenu(List<Menu> menu) {
        System.out.println(ORDER_MENU_MESSAGE);
        for(Menu menus : menu){
            System.out.printf(ORDER_MENU,menus.getName(),menus.getCount());
        }
    }

    public static void printAfterDiscount(int menuPrice) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        System.out.printf(AFTER_DISCOUNT_MESSAGE);
        System.out.printf(AFTER_DISCOUNT,numberFormat.format(menuPrice));

    }
}

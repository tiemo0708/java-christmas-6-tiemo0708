package christmas.view;

import christmas.domain.model.Events;
import christmas.domain.model.Menu;

import java.text.NumberFormat;
import java.util.List;

public class OutputView {

    static NumberFormat numberFormat = NumberFormat.getInstance();
    private static final String WELCOME_MESSAGE = "안녕하세요! 우테코 식당 %d월 이벤트 플래너입니다.";
    private static final String DATE_MESSAGE = "%d월 %d에 우테코 식당에서 받을 이벤트 혜택 미리보기!%n%n";
    private static final String ORDER_MENU_MESSAGE = "<주문 메뉴>";
    private static final String ORDER_MENU = "%s %s개%n";
    private static final String AFTER_DISCOUNT_MESSAGE="%n<할인 전 총주문 금액>%n";
    private static final String AFTER_DISCOUNT="%s원%n%n";
    private static final String PRESENT_MESSAGE="<증정 메뉴>";
    private static final String BENEFIT_MESSAGE="<혜택 내역>";
    private static final String BENEFIT_REPORT="%s: -%s%n";
    private static final String BENEFIT_AMOUNT_MESSAGE = "%n<총혜택 금액>%n";
    private static final String BENEFIT_AMOUNT ="-%s%n";
    private static final String PAYMENT_MESSAGE="%n<할인 후 예상 결제 금액>%n";
    private static final String PAYMENT_AMOUNT="%s원%n";

    private static final int MONTH=12;
    private static final int ZERO = 0;
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
        System.out.printf(AFTER_DISCOUNT_MESSAGE);
        System.out.printf(AFTER_DISCOUNT,numberFormat.format(menuPrice));

    }

    public static void printPresentation(String presentationEvent) {
        System.out.println(PRESENT_MESSAGE);
        System.out.println(presentationEvent);
    }

    public static void printBenefitsDetails(List<Events> classification, int menuPrice) {
        System.out.println(BENEFIT_MESSAGE);
        int discountSum=ZERO;
        for(Events events : classification){
            discountSum+=events.getAmount();
            System.out.printf(BENEFIT_REPORT,events.getDiscountKind(),numberFormat.format(events.getAmount()));
        }
        System.out.printf(BENEFIT_AMOUNT_MESSAGE);
        System.out.printf(BENEFIT_AMOUNT,numberFormat.format(discountSum));
        System.out.printf(PAYMENT_MESSAGE);
        System.out.printf(PAYMENT_AMOUNT,numberFormat.format(menuPrice-discountSum));


    }
}

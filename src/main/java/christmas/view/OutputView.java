package christmas.view;

import christmas.model.Events;
import christmas.model.Foods;

import java.text.NumberFormat;
import java.util.List;

public class OutputView {
    NumberFormat numberFormat = NumberFormat.getInstance();
    public void greet(){
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
    }

    public void printDate(int date){
        System.out.println("12월 "+date+"에 우테코 식당에서 받을 이벤트 혜택 미리보기" );
        System.out.println();
    }
    public void printMenu(List<Foods> menu) {
        System.out.println("<주문 메뉴>");
        for(Foods foods : menu){
            System.out.println(foods.getName()+" "+foods.getCount()+"개");
        }
        System.out.println();
    }

    public void printAfterDiscount(int price) {
        System.out.println("<할인 전 총주문 금액>");
        System.out.println(numberFormat.format(price)+"원");
        System.out.println();
    }

    public void printPresent(String presentationEvent) {
        System.out.println("<증정 메뉴>");
        System.out.println(presentationEvent);
        System.out.println();
    }

    public void printBenefitsDetails(List<Events> classification, int menuPrice) {
        System.out.println("<혜택 내역>");
        int discountSum=0;
        for(Events events : classification){
            discountSum+=events.getAmount();
            System.out.println(events.getDiscountKind()+": -"+numberFormat.format(events.getAmount()));
        }
        System.out.println();
        System.out.println("<총혜택 금액>");
        System.out.println("-"+numberFormat.format(discountSum));
        System.out.println();
        System.out.println("<할인 후 예상 결제 금액>");
        System.out.println(numberFormat.format(menuPrice-discountSum)+"원");
        System.out.println();
    }

    public void printPaymentPrice(int menuPrice, List<Events> classification) {
    }

    public void printBadge(String badge) {
        System.out.println("<12월 이벤트 배지>");
        System.out.println(badge);
    }
    // ...
}
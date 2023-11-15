package christmas.view;

import christmas.model.Events;
import christmas.model.Foods;

import java.util.List;

public class OutputView {

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
        System.out.println(price+"원");
        System.out.println();
    }

    public void printPresent(String presentationEvent) {
        System.out.println("<증정 메뉴>");
        System.out.println(presentationEvent);
        System.out.println();
    }

    public void printBenefitsDetails(List<Events> classification) {
        System.out.println("<헤택 내역>");
        for(Events events : classification){
            System.out.println(events.getDiscountKind()+": -"+events.getAmount());
        }
    }
    // ...
}
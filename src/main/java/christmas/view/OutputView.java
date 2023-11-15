package christmas.view;

import christmas.model.Foods;

import java.util.List;

public class OutputView {

    public void greet(){
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
    }

    public void printDate(int date){
        System.out.println("12월 "+date+"에 우테코 식당에서 받을 이벤트 혜택 미리보기" );
    }
    public void printMenu(List<Foods> menu) {
        System.out.println("<주문 메뉴>");
        for(Foods foods : menu){
            System.out.println(foods.getName()+" "+foods.getCount()+"개");
        }
    }
    // ...
}
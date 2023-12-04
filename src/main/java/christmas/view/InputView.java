package christmas.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    private static final String ASK_DATE = ("%n%d월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
    private static final String ASK_MENU = ("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
    private static final String MONTH =("12");

    public String readDate() {
        System.out.printf(ASK_DATE, MONTH);
        return Console.readLine();
    }
    public List<String> readMenu(){
        System.out.println(ASK_MENU);
        return Arrays.asList(Console.readLine().split(","));
    }
}

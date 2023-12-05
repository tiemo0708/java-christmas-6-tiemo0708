package christmas.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

import static christmas.global.ERROR.INVALID_DATE;

public class InputView {
    private static final String ASK_DATE = ("%n%d월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)%n");
    private static final String ASK_MENU = ("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
    private static final int MONTH =(12);

    public static String askDate() {
        System.out.printf(ASK_DATE, MONTH);
        return validateDate(Console.readLine());
    }

    private static String validateDate(String date) {
            if(!date.matches("(0[1-9]|[12][0-9]|3[01])")){
                throw new IllegalArgumentException(INVALID_DATE.getMessage());
            }
        return date;
    }


    public List<String> readMenu(){
        System.out.println(ASK_MENU);
        return Arrays.asList(Console.readLine().split(","));
    }
}

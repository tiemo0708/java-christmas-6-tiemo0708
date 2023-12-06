package christmas.domain;

import christmas.controller.ChristmasEvent;
import christmas.domain.model.Events;

import static christmas.domain.model.Menu.CHAMPAGNE;

public class Discount {
    private static final String PRESENT_TRUE="%s %s개";
    private static final String EVENT_FALSE = "없음";
    private static final int MIN_PRICE =120_000;
    private static final int MIN_MENU_PRICE =12_000;
    private static final int ONE=1;
    static ChristmasEvent christmasEvent = new ChristmasEvent();
    public static String presentationEvent(int menuPrice) {
        christmasEvent.presentationEvent(checkPresntation(menuPrice));
        if(menuPrice>MIN_MENU_PRICE){
            return PRESENT_TRUE.formatted(CHAMPAGNE.getName(),CHAMPAGNE.getCount());
//                    CHAMPAGNE.getName()+" "+CHAMPAGNE.getCount()+"개";
        }
        return EVENT_FALSE;
    }

    private static Events checkPresntation(int price) {
        if(price>MIN_PRICE){
            CHAMPAGNE.setCount(ONE);
            return Events.PRESENT;
        }
        return Events.NO_EVENTS;
    }
}

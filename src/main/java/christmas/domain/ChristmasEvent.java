package christmas.domain;

import christmas.domain.VisitDate;
import christmas.domain.model.Events;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ChristmasEvent {
    private int date;
    private static final List<Events> eventsDiscount = new ArrayList<>();
    private static int discountSum;

    public static List<Events> classification(int visitDate) {
        eventsDiscount.add(dayEvent(visitDate));
        eventsDiscount.add(dayOfWeekEvent(visitDate));
        eventsDiscount.add(SpecialEvent(visitDate));
        return eventsDiscount.stream()
                .filter(i -> !i.getDiscountKind().equals("없음"))
                .toList();
    }
    private static Events SpecialEvent(int date) {
        if(date==3||date==10||date==17||date==24||date==25||date==31){
            return Events.SPECIAL_DISCOUNT;
        }
        return Events.NO_EVENTS;
    }

    private static Events dayOfWeekEvent(int day) {
        checkDayOfWeek(day);
        if(day==5||day==6){
            return Events.WEEKEND_DISCOUNT;
        }
        return Events.WEEKDAY_DISCOUNT;
    }

    private static int checkDayOfWeek(int date) {
        LocalDate weekDate = LocalDate.of(2023, 12, date);
        DayOfWeek dayOfWeek = weekDate.getDayOfWeek();
        return dayOfWeek.getValue();
    }

    public static Events dayEvent(int i){
        if(i<26){
            Events.CHRISTMAS_D_DAY_DISCOUNT.setAmount(i*100);
            return Events.CHRISTMAS_D_DAY_DISCOUNT;
        }
        return Events.NO_EVENTS;
    }

    public static void setClassification(List<Events> classification) {
        for(Events events : classification){
            discountSum +=events.getAmount();
        }
    }

    public void presentationEvent(Events events) {
        eventsDiscount.add(events);
    }
}

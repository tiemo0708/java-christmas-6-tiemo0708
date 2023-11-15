package christmas.model;

import java.util.ArrayList;
import java.util.List;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class ChristmasEvent {
    private int date;
    private static final List<Events> eventsDiscount = new ArrayList<>();
    private int discountSum;

    public ChristmasEvent(){

    }

    public List<Events> classification() {
        eventsDiscount.add(dayEvent(this.date));
        eventsDiscount.add(dayOfWeekEvent(this.date));
        eventsDiscount.add(SpecialEvent(this.date));
        return eventsDiscount.stream()
                .filter(i -> !i.getDiscountKind().equals("없음"))
                .toList();
    }

    private Events SpecialEvent(int date) {
        if(date==3||date==10||date==17||date==24||date==25||date==31){
            return Events.SPECIAL_DISCOUNT;
        }
        return Events.NO_EVENTS;
    }

    private Events dayOfWeekEvent(int day) {
       checkDayOfWeek(day);
        if(day==5||day==6){
            return Events.WEEKEND_DISCOUNT;
        }
        return Events.WEEKDAY_DISCOUNT;
    }

    private int checkDayOfWeek(int date) {
        LocalDate weekDate = LocalDate.of(2023, 12, date);
        DayOfWeek dayOfWeek = weekDate.getDayOfWeek();
        return dayOfWeek.getValue();
    }

    public Events dayEvent(int i){
        if(i<26){
            Events.CHRISTMAS_D_DAY_DISCOUNT.setAmount(i*100);
            return Events.CHRISTMAS_D_DAY_DISCOUNT;
        }
       return Events.NO_EVENTS;
    }
    public int getDate(){
        return this.date;
    }
    public void setDate(int date) {
        this.date = date;
    }


    public void presentationEvent(Events events) {
        eventsDiscount.add(events);
    }


    public void setClassification(List<Events> classification) {
        for(Events events : classification){
            this.discountSum +=events.getAmount();
        }

    }


    public String badge() {
        if(this.discountSum>=20000){
            return "산타";
        }
        if (this.discountSum>=10000){
            return "트리";
        }
        if(this.discountSum>=5000){
            return "별";
        }
        return "없음";
    }
}

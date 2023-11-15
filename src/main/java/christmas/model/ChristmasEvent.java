package christmas.model;

import java.util.ArrayList;
import java.util.List;

public class ChristmasEvent {
    private int date;
    private static final List<Events> eventsDiscount = new ArrayList<>();
    public ChristmasEvent(){

    }

    public void classification(int date) {
        this.date = date;
        eventsDiscount.add(dayEvent(date));
        eventsDiscount.add(weekDayEvent(date));
        eventsDiscount.add(weekendDatEvent(date));

    }

    private Events weekendDatEvent(int i) {
        return  null;
    }

    private Events weekDayEvent(int i) {
        return null;
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


    public void presentationEvent(Events events) {
        eventsDiscount.add(events);
    }
}

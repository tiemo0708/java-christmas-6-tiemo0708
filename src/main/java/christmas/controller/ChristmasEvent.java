package christmas.controller;

import christmas.domain.model.Events;

import java.util.ArrayList;
import java.util.List;

public class ChristmasEvent {
    private int date;
    private static final List<Events> eventsDiscount = new ArrayList<>();
    private int discountSum;
    public void presentationEvent(Events events) {
        eventsDiscount.add(events);
    }
}

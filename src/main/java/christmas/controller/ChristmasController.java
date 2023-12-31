package christmas.controller;

import christmas.model.ChristmasEvent;
import christmas.model.Events;
import christmas.model.Menu;
import christmas.view.InputView;
import christmas.view.OutputView;

import java.util.List;

public class ChristmasController {
    InputView inputView = new InputView();
    OutputView output = new OutputView();
    ChristmasEvent christmasEvent = new ChristmasEvent();
    Menu menu = new Menu();
    public ChristmasController(){

    }
    public void greet() {
        output.greet();
    }
    public void readDate() {
        christmasEvent.setDate(Integer.parseInt(inputView.readDate()));
    }
    public void readMenu() {
        menu.orderMenu(inputView.readMenu());

    }
    public void printDate(){
        output.printDate(christmasEvent.getDate());
    }

    public void printMenu(){
        output.printMenu(menu.getMenu());

    }
    public void printAfterDiscount(){
        output.printAfterDiscount(menu.getMenuPrice());
    }

    public void printPrentationEvent() {
        output.printPresent(menu.getPresentationEvent());


    }

    public void printBenefitsDetails() {
        List<Events> classification=  christmasEvent.classification();
        output.printBenefitsDetails(classification,menu.getMenuPrice());
        christmasEvent.setClassification(classification);
    }

    public void printPaymentPrice() {
        output.printPaymentPrice(menu.getMenuPrice(),christmasEvent.classification());
    }

    public void printBadge() {
        output.printBadge(christmasEvent.badge());
    }
}

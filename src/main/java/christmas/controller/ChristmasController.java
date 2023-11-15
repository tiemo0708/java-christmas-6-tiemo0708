package christmas.controller;

import christmas.model.ChristmasEvent;
import christmas.model.Menu;
import christmas.view.InputView;
import christmas.view.OutputView;

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
        christmasEvent.classification(Integer.parseInt(inputView.readDate()));
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
}

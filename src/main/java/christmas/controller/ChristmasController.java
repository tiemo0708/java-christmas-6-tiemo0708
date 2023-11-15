package christmas.controller;

import christmas.view.InputView;
import christmas.view.OutputView;

public class ChristmasController {
    InputView inputView = new InputView();
    OutputView output = new OutputView();

    public ChristmasController(){

    }
    public void greet() {
        output.greet();
    }
    public void readDate() {
        inputView.readDate();
    }
}

package christmas;

import christmas.controller.ChristmasController;
import christmas.view.InputView;
import christmas.view.OutputView;

public class Application {

    public static void main(String[] args) {
        ChristmasController christmasController = new ChristmasController();
        christmasController.greet();
        christmasController.readDate();
        christmasController.readMenu();
        christmasController.printDate();
        christmasController.printMenu();
        christmasController.printAfterDiscount();
        christmasController.printPrentationEvent();
        christmasController.printBenefitsDetails();
        christmasController.printPaymentPrice();
        christmasController.printBadge();
    }
}

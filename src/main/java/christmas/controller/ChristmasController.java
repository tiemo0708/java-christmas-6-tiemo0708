package christmas.controller;

import christmas.domain.VisitDate;
import christmas.view.InputView;
import christmas.view.OutputView;
import christmas.domain.Order;

public class ChristmasController {
    public void run() {
        OutputView.welcomMessage();
        VisitDate visitDate =  askDate();
        askMenu();

    }

    private void askMenu() {
        Order.orderMenu(InputView.askMenu());
    }

    private VisitDate askDate() {
        while (true) {
            try {
                return new VisitDate(InputView.askDate());
            } catch (IllegalArgumentException e) {
                OutputView.printError(e);
            }
        }
    }
}

package christmas.controller;

import christmas.domain.VisitDate;
import christmas.view.InputView;
import christmas.view.OutputView;

public class ChristmasController {
    public void run() {
        OutputView.welcomMessage();
        VisitDate visitDate =  askDate();

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

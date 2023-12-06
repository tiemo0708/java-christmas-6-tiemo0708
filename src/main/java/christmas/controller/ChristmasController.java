package christmas.controller;

import christmas.domain.ChristmasEvent;
import christmas.domain.Discount;
import christmas.domain.VisitDate;
import christmas.domain.model.Events;
import christmas.view.InputView;
import christmas.view.OutputView;
import christmas.domain.Order;

import java.util.List;

public class ChristmasController {
    public void run() {
        OutputView.welcomMessage();
        VisitDate visitDate =  askDate();
        askMenu();
        printDate(visitDate);
        printMenu();
        printAfterDiscount();
        printPresentationEvent();
        printBenefitsDetails(visitDate);
    }

    private void printBenefitsDetails(VisitDate visitDate) {
        List<Events> classification=  ChristmasEvent.classification(visitDate.getDate());
        OutputView.printBenefitsDetails(classification,Order.getMenuPrice());
        ChristmasEvent.setClassification(classification);
    }

    private void printPresentationEvent() {
        OutputView.printPresentation(Discount.presentationEvent(Order.getMenuPrice()));
    }

    private void printAfterDiscount() {
        OutputView.printAfterDiscount(Order.getMenuPrice());
    }

    private void printMenu() {
        OutputView.printMenu(Order.getMenu());
    }

    private void printDate(VisitDate visitDate) {
        OutputView.printDate(visitDate.getDate());
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

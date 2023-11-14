package christmas.model;

public enum Events {
    CHRISTMAS_D_DAY_DISCOUNT("totalOrderDiscount",1000),
    WEEKDAY_DISCOUNT("dessertDiscount",2023),
    WEEKEND_DISCOUNT("mainDiscount",2023),
    SPECIAL_DISCOUNT("TotalOrderDiscount",1000),
    PRESENT("gift",25000);

    private final String discountKind;
    private final int amount;

    Events(String discountKind, int amount) {
        this.discountKind = discountKind;
        this.amount = amount;
    }
    public String getDiscountKind() {
        return this.discountKind;
    }
    public int getAmount() {
        return this.amount;
    }
}

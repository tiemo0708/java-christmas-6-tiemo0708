package christmas.model;

public enum Events {
    CHRISTMAS_D_DAY_DISCOUNT("크리스마스 디데이 할인",1000),
    WEEKDAY_DISCOUNT("평일 할인",2023),
    WEEKEND_DISCOUNT("주말 할인",2023),
    SPECIAL_DISCOUNT("특별 할인",1000),
    PRESENT("증정 이벤트",25000),
    NO_EVENTS("",0);
    private final String discountKind;
    private int amount;

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
    public void setAmount(int amount) {
        this.amount += amount;
    }
}

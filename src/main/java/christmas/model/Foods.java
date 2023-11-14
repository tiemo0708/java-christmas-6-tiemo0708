package christmas.model;

public enum Foods {
    MUSHROOM_SOUP("appetizer","양송이수프", 6000),
    TAPAS("appetizer","타파스",5500),
    CAESAR_SALAD("appetizer","시저샐러드",8000),
    T_BONE_STEAK("main","티본스테이크",55000),
    BBQ_RIBS("main","바비큐립",54000),
    SEAFOOD_PASTA("main","해산물파스타",35000),
    CHRISTMAS_PASTA("main","크리스마스파스타",25000),
    CHOCOLATE_CAKE("Dessert","초코케이크",15000),
    ICE_CREAM("Dessert","아이스크림",5000),
    ZERO_COKE("drink","제로콜라",3000),
    RED_WINE("drink","레드와인",60000),
    CHAMPAGNE("drink","샴페인",25000);

    private final String type;
    private final String name;
    private final int price;


    Foods(String type, String name, int price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

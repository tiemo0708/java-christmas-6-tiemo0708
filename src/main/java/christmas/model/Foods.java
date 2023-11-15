package christmas.model;

public enum Foods {
    MUSHROOM_SOUP("appetizer","양송이수프", 6000,0),
    TAPAS("appetizer","타파스",5500,0),
    CAESAR_SALAD("appetizer","시저샐러드",8000,0),
    T_BONE_STEAK("main","티본스테이크",55000,0),
    BBQ_RIBS("main","바비큐립",54000,0),
    SEAFOOD_PASTA("main","해산물파스타",35000,0),
    CHRISTMAS_PASTA("main","크리스마스파스타",25000,0),
    CHOCOLATE_CAKE("Dessert","초코케이크",15000,0),
    ICE_CREAM("Dessert","아이스크림",5000,0),
    ZERO_COKE("drink","제로콜라",3000,0),
    RED_WINE("drink","레드와인",60000,0),
    CHAMPAGNE("drink","샴페인",25000,0);

    private final String type;
    private final String name;
    private final int price;
    private int count;

    Foods(String type, String name, int price, int count) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getCount(){
        return this.count;
    }


    public void setCount(int count) {
        this.count = count;
    }
}

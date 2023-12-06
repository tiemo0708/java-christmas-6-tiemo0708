package christmas.domain.model;

import static christmas.domain.model.MenuCategory.*;

public enum Menu {
    MUSHROOM_SOUP(APPETIZER,"양송이수프", 6_000,0),
    TAPAS(APPETIZER,"타파스",5_500,0),
    CAESAR_SALAD(APPETIZER,"시저샐러드",8_000,0),
    T_BONE_STEAK(MAIN_DISH,"티본스테이크",55_000,0),
    BBQ_RIBS(MAIN_DISH,"바비큐립",54_000,0),
    SEAFOOD_PASTA(MAIN_DISH,"해산물파스타",35_000,0),
    CHRISTMAS_PASTA(MAIN_DISH,"크리스마스파스타",25_000,0),
    CHOCOLATE_CAKE(DESSERT,"초코케이크",15_000,0),
    ICE_CREAM(DESSERT,"아이스크림",5_000,0),
    ZERO_COKE(DRINK,"제로콜라",3_000,0),
    RED_WINE(DRINK,"레드와인",60_000,0),
    CHAMPAGNE(DRINK,"샴페인",25_000,0);

    private final MenuCategory category;
    private final String name;
    private final int price;
    private int count;

    Menu(MenuCategory category, String name, int price, int count) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.count = count;
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

    public MenuCategory getCategory() {
        return this.category;
    }
    public void setCount(int count) {
        this.count = count;
    }
}

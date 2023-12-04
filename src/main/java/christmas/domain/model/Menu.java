package christmas.domain.model;

import static christmas.domain.model.MenuCategory.*;

public enum Menu {
    MUSHROOM_SOUP(APPETIZER,"양송이수프", 6000,0),
    TAPAS(APPETIZER,"타파스",5500,0),
    CAESAR_SALAD(APPETIZER,"시저샐러드",8000,0),
    T_BONE_STEAK(MAIN_DISH,"티본스테이크",55000,0),
    BBQ_RIBS(MAIN_DISH,"바비큐립",54000,0),
    SEAFOOD_PASTA(MAIN_DISH,"해산물파스타",35000,0),
    CHRISTMAS_PASTA(MAIN_DISH,"크리스마스파스타",25000,0),
    CHOCOLATE_CAKE(DESSERT,"초코케이크",15000,0),
    ICE_CREAM(DESSERT,"아이스크림",5000,0),
    ZERO_COKE(DRINK,"제로콜라",3000,0),
    RED_WINE(DRINK,"레드와인",60000,0),
    CHAMPAGNE(DRINK,"샴페인",25000,0);

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


    public void setCount(int count) {
        this.count = count;
    }
}

package christmas.model;

import java.util.List;

import static christmas.model.Foods.*;
import static java.util.Arrays.asList;

public class Menu {
    ChristmasEvent christmasEvent = new ChristmasEvent();
    List<Foods> foods = asList(MUSHROOM_SOUP,TAPAS,CAESAR_SALAD,T_BONE_STEAK,BBQ_RIBS,SEAFOOD_PASTA
    ,CHRISTMAS_PASTA,CHOCOLATE_CAKE,ICE_CREAM,ZERO_COKE,RED_WINE,CHAMPAGNE);
    private int price;

    //    List<String> menu = new ArrayList<>();
//    List<String> count = new ArrayList<>();
    public Menu(){

    }
    public void orderMenu(List<String> OrderMenus){

        for(String OrderMenu:OrderMenus){
            int idx = OrderMenu.indexOf("-");
            List<Foods> foodName=foods.stream()
                    .filter(i -> i.getName().equals(OrderMenu.substring(0,idx)))
                    .toList();
            foodName.get(0).setCount(Integer.parseInt(OrderMenu.substring(idx+1)));

//            addOrder(OrderMenu.substring(0,idx));
//            menu.add(OrderMenu.substring(0,idx));
//            count.add(OrderMenu.substring(++idx));

        }
    }
    public List<Foods> getMenu() {
        return foods.stream()
                .filter(i -> i.getCount()>0)
                .toList();
    }
    public int getMenuPrice() {
        return sumPrice(foods.stream()
                .filter(i -> i.getCount()>0)
                .toList());

    }


    public int sumPrice(List<Foods> menu){
        int price =0;
        for (Foods foods : menu) {
            price+=foods.getPrice() * foods.getCount();
        }
        this.price =  price;
        return price;
    }


    public String getPresentationEvent() {
        christmasEvent.presentationEvent(checkPresntation(this.price));
        if(this.price>12000){
            return CHAMPAGNE.getName()+" "+CHAMPAGNE.getCount()+"개";
        }
        return"없음";
    }

    private Events checkPresntation(int price) {
        if(price>120000){
            CHAMPAGNE.setCount(1);
            return Events.PRESENT;
        }
        return Events.NO_EVENTS;
    }
}

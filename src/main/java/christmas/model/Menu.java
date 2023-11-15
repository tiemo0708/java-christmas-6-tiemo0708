package christmas.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static christmas.model.Foods.*;
import static java.util.Arrays.asList;

public class Menu {
    List<Foods> foods = asList(MUSHROOM_SOUP,TAPAS,CAESAR_SALAD,T_BONE_STEAK,BBQ_RIBS,SEAFOOD_PASTA
    ,CHRISTMAS_PASTA,CHOCOLATE_CAKE,ICE_CREAM,ZERO_COKE,RED_WINE,CHAMPAGNE);
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




}

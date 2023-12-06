package christmas.domain;

import christmas.domain.model.Menu;

import java.util.Arrays;
import java.util.List;

import static christmas.domain.model.MenuCategory.DRINK;
import static christmas.global.Error.BLANK;
import static christmas.global.Error.INVALID_ORDER;

public class Order {
    static List<Menu> menus = Arrays.asList(Menu.values());

    public static void orderMenu(List<String> OrderMenus) {
            try {
                for (String OrderMenu : OrderMenus) {
                    int idx = OrderMenu.indexOf("-");
                    List<Menu> menuName = menus.stream()
                            .filter(i -> i.getName().equals(OrderMenu.substring(0, idx)))
                            .toList();
                    menuName.get(0).setCount(Integer.parseInt(OrderMenu.substring(idx + 1)));
                }
            }catch (NumberFormatException | ArrayIndexOutOfBoundsException e){
                throw new IllegalStateException(INVALID_ORDER.getMessage());
            }catch (StringIndexOutOfBoundsException e){
                throw new IllegalStateException(BLANK.getMessage());
            }
        }


    public static List<Menu> getMenu() {
        return menus.stream()
                .filter(i -> i.getCount()>0)
                .toList();
    }

    public static int getMenuPrice() {
        return sumPrice(menus.stream()
                .filter(i -> i.getCount()>0)
                .toList());
    }

    private static int sumPrice(List<Menu> menus) {
        int price =0;
        for (Menu menu : menus) {
            price+=menu.getPrice() * menu.getCount();
        }
        return price;
    }

    public static void validateDrinks() {
        List<Menu> drinksMenu= menus.stream()
                .filter(i -> i.getCount()>0)
                .filter(i ->!i.getCategory().equals(DRINK))
                .toList();

        if(drinksMenu.isEmpty()){
            throw new IllegalStateException(INVALID_ORDER.getMessage());
        }
    }

}
package christmas.domain;

import christmas.domain.model.Menu;

import java.util.Arrays;
import java.util.List;

public class Order {
    static List<Menu> menus = Arrays.asList(Menu.values());

    public static void orderMenu(List<String> OrderMenus) {
        for (String OrderMenu : OrderMenus) {
            int idx = OrderMenu.indexOf("-");
            List<Menu> menuName = menus.stream()
                    .filter(i -> i.getName().equals(OrderMenu.substring(0, idx)))
                    .toList();
            menuName.get(0).setCount(Integer.parseInt(OrderMenu.substring(idx + 1)));
        }
    }

    public static List<Menu> getMenu() {
        return menus.stream()
                .filter(i -> i.getCount()>0)
                .toList();
    }
}
package christmas;

import christmas.domain.Order;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import java.util.Collections;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class OrderTest {

    @DisplayName("주문 개수가 숫자가 아니면 오류가 발생한다.")
    @Test
    void testOrderCharValidation() {
        Order order = new Order();

        assertThatThrownBy(() -> order.orderMenu(Collections.singletonList("해산물파스타-a")))
                .isInstanceOf(IllegalStateException.class);
    }
    @DisplayName("없는 메뉴를 주문하면 오류가 발생한다.")
    @Test
    void testOrderValidation() {
        Order order = new Order();

        assertThatThrownBy(() -> order.orderMenu(Collections.singletonList("빠네파스타-2")))
                .isInstanceOf(IllegalStateException.class);
    }

    @DisplayName("빈칸을 입력하면 오류가 발생한다.")
    @Test
    void testOrderBlankValidation() {
        Order order = new Order();

        assertThatThrownBy(() -> order.orderMenu(Collections.singletonList("")))
                .isInstanceOf(IllegalStateException.class);
    }
}

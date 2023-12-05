package christmas;

import christmas.view.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class InputViewTest {
     InputView inputView;

     public InputViewTest() {
         inputView = new InputView();
     }

     @DisplayName("1~31사이의 숫자가 아니면 예외가 발생한다.")
     @ValueSource(strings = {"32"})
     @ParameterizedTest
     void validateDate(String date) {
         assertThatThrownBy(() -> InputView.validateDate(date))
                 .isInstanceOf(IllegalArgumentException.class);
     }
}

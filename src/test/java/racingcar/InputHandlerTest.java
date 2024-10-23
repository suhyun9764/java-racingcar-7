package racingcar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import camp.nextstep.edu.missionutils.Console;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputHandlerTest {


    private final InputStream originalSystemIn = System.in;

    @AfterEach
    void restoreSystemInStream() {
        System.setIn(originalSystemIn);
        Console.close();
    }

    private void setInput(String input) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(inputStream);
    }


    @DisplayName("사용자가 입력한 자동차 이름들이 정상적으로 추출")
    @Test
    void requestCarNames_Returns_Correct_Car_Names() {
        //given
        String input = "car,car1,car12\n";
        setInput(input);

        //when
        List<String> carNames = InputHandler.requestCarNames();
        List<String> expectedCarNames = Arrays.asList("car", "car1", "car12");

        //then
        assertEquals(expectedCarNames, carNames);
    }

    @DisplayName("이름의 앞이나 뒤에 공백이 있을 경우 공백을 없애고 이름 저장")
    @Test
    void requestCarNames_Trims_Whitespace() {
        //given
        String input = "  car,car1  ,         car12\n";
        setInput(input);

        //when
        List<String> carNames = InputHandler.requestCarNames();
        List<String> expectedCarNames = Arrays.asList("car", "car1", "car12");

        //then
        assertEquals(expectedCarNames, carNames);
    }
}
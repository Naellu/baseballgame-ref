import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ValidateUserInputTest {

    ModelLogicTest mc = new ModelLogicTest();

    private static final int DEFALUT_LENGTH = 3;
    private static final String IS_NUMBER_ERROR = "잘못된 입력값입니다: 숫자만 입력해주십시오";
    private static final String IS_LENGTH_ERROR = "잘못된 입력값입니다: 세자릿수로 입력해주십시오";

    List<String> userNumbers = new ArrayList<>();

    @Test
    void ValidString() {
        String userInput = "123";
//        String userInput = "1234";
//        String userInput = "12";
//        String userInput = "gg2";
//        String userInput = "한글몇자리";
        System.out.println("userInput = " + userInput);

        if (!Pattern.matches("[0-9]+", userInput)) {
            throw new IllegalArgumentException(IS_NUMBER_ERROR);
        }

        if (userInput.length() < DEFALUT_LENGTH || userInput.length() > DEFALUT_LENGTH) {
            throw new IllegalArgumentException(IS_LENGTH_ERROR);
        }

    }
}

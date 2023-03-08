import org.example.model.Computer;
import org.example.model.Referee;
import org.example.model.User;
import org.example.view.GameDisplay;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ApplicationTest {

    @Test
    public void trueTest() {
        assertTrue(true);
    }

    @Test
    @DisplayName("컴퓨터 숫자가 제대로 들어있는지 테스트")
    public void computerNumberTest() {
        Computer computer = new Computer();
        List<String> computerNumbers = computer.initNumbers();
        System.out.println("computerNumbers = " + computerNumbers.toString());

        assertThat(computerNumbers).isNotEmpty();
        assertThat(computerNumbers).isNotNull();

    }

    @Test
    @DisplayName("입력한 숫자를 하나씩 나눠서 들어가는지 테스트")
    public void userNewLogicTest() {
        String number = "123";

        List<String> userNumber = new User(number).initUserThreeNumber();
        System.out.println("userNumber = " + userNumber.toString());
        assertThat(userNumber).contains("1", "2", "3");

        List<String> testCase = new ArrayList<>();
        testCase.add("1");
        testCase.add("2");
        testCase.add("3");

        assertThat(userNumber).isEqualTo(testCase);
    }

    @Test
    @DisplayName("예외가 발생하는지 테스트")
    public void exceptionTest() {
        String number01 = "김김김";
        String number02 = "123145152";
        String number03 = "%^$";
        String number04 = "   ";
        String trueNumber = "123";

        List<String> userNumber = new User(trueNumber).initUserThreeNumber();

    }

    @Test
    @DisplayName("볼과 스트라이크를 계산하고 배열로 반환하는 테스트")
    public void refereeTest() {
        List<String> test01 = Arrays.asList("1", "2", "3");
        List<String> test02 = Arrays.asList("1", "3", "2");

        Referee referee = new Referee();
        int[] arr = referee.comparePlayerNumbers(test01, test02);
        System.out.println("ball : " + arr[0]);
        System.out.println("strike : " + arr[1]);

        int[] ballAndStrikeTestArr = new int[2];
        ballAndStrikeTestArr[0] = 0;
        ballAndStrikeTestArr[0] = 0;

        assertThat(arr).isNotEqualTo(ballAndStrikeTestArr);
    }

    @Test
    @DisplayName("볼과 스트라이크 출력 테스트")
    public void gameMessageTest() {
        List<String> test01 = Arrays.asList("1", "2", "3");
        List<String> test02 = Arrays.asList("1", "3", "2");

        Referee referee = new Referee();
        int[] ballAndStrike = referee.comparePlayerNumbers(test01, test02);
        System.out.println("ball = " + ballAndStrike[0]);
        System.out.println("strike = " + ballAndStrike[1]);

        GameDisplay gameDisplay = new GameDisplay();
        gameDisplay.printMessage(ballAndStrike);
    }

    // Referee 내부 로직을 스트림으로 바꾼 뒤 테스트 하는 용도, 아직 작성하지 않았음
    @Test
    public void refereeStreamTest() {}
}

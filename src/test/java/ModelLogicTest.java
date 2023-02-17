import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ModelLogicTest {

    private static final int NUM_LIMIT = 9;
    private static final int ONE = 1;
    private static final int MAX_SIZE = 3;
    List<String> computerNum = new ArrayList<>();
    List<String> userNumbers = new ArrayList<>();


    @Test
    void getComputerNum() {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        while (computerNum.size() < MAX_SIZE) {
            String num = String.valueOf(
                    (random.nextInt(NUM_LIMIT) + ONE)
            );

            if (!computerNum.contains(num)) {
                computerNum.add(num);
            }

        }
        System.out.println("computerNum: " + computerNum.toString());
    }

    @Test
    public void getUserNum() {

        String userInput = "476"; // 유저 입력 값
        for (int i = 0; i < userInput.length(); i++) {
            userNumbers.add(userInput.substring(i, i + 1));
        }
        System.out.println("userNumbers: " + userNumbers.toString());
        System.out.println("userInput = " + userInput);
    }

    @Test
    void resetUserNum() {
        userNumbers.clear();
    }
}

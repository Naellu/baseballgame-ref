package org.example.controller;

import org.example.model.Computer;
import org.example.model.Number;
import org.example.model.Referee;
import org.example.model.User;
import org.example.view.GameDisplay;

import java.util.List;
import java.util.Scanner;

import static org.example.model.ConstValues.OUT;
import static org.example.model.ConstValues.RESTART;
import static org.example.model.ConstValues.STRIKE;

public class BaseballController {
//    private static Number number;
//    private static User user;
//    private static Computer computer;
//    private static Referee referee;
//    private static int[] ballAndStrike;
//    private static GameDisplay gameDisplay;

    private Number number;
    private User user;
    private Computer computer;
    private Referee referee;
    private int[] ballAndStrike;
    private GameDisplay gameDisplay;

    public void playGame() {
        computer = new Computer();
        number = new Number();
        referee = new Referee();
        gameDisplay = new GameDisplay();

        gameDisplay.printStartMessage();
        List<String> computerNumbers = computer.initNumbers();

        ballAndStrike = JudgeBallAndStrike(gameDisplay, computerNumbers);

        gameDisplay.printMessage(ballAndStrike);

        if (!(isStrikeThree(ballAndStrike))) {
            guessTheAnswer(gameDisplay, computerNumbers);
        }
        restartGame();
    }

    // 심판한 볼과 스트라이크를 담은 배열을 반환
    private int[] JudgeBallAndStrike(GameDisplay gameDisplay, List<String> computerNumbers) {
        gameDisplay.showInputNumberMessage();

        String inputNumber = number.typingThreeLengthNumber();
        user = new User(inputNumber);
        List<String> userNumbers = user.initUserThreeNumber();

        return ballAndStrike = referee.comparePlayerNumbers(userNumbers, computerNumbers);
    }

    // 정답이 아니라면 반복
    private void guessTheAnswer(GameDisplay gameDisplay, List<String> computerNumbers) {

        while (!(isStrikeThree(ballAndStrike))) {
            ballAndStrike = JudgeBallAndStrike(gameDisplay, computerNumbers);
            gameDisplay.printMessage(ballAndStrike);

            if (isStrikeThree(ballAndStrike)) {
                break;
            }
        }
    }

    // 스트라이크가 3개(정답)인지 판별
    private boolean isStrikeThree(int[] ballAndStrike) {
        if (ballAndStrike[STRIKE] == OUT) {
            return true;
        }
        return false;
    }

    private void restartGame() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        if (scanner.next().equals(RESTART)) {
            playGame();
        }

    }
}

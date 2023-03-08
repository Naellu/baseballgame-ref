package org.example.view;

import static org.example.model.ConstValues.BALL;
import static org.example.model.ConstValues.NOTHING;
import static org.example.model.ConstValues.OUT;
import static org.example.model.ConstValues.STRIKE;

public class GameDisplay {

    public void printMessage(int[] ballAndStrike) {
        printBallAndStrike(ballAndStrike);
    }

    public void printStartMessage() {
        System.out.println("숫자야구 게임을 시작합니다");
    }

    public void showInputNumberMessage() {
        System.out.print("숫자를 입력해주세요: ");
    }

    private void printBallAndStrike(int[] ballAndStrike) {
        int ball = ballAndStrike[BALL];
        int strike = ballAndStrike[STRIKE];
        emptyNumber(ball, strike);
        isExistBallAndStrike(ball, strike);
        correctAnswer(strike);
    }

    private void isExistBallAndStrike(int ballCount, int strikeCount) {
        if (ballCount > NOTHING) {
            System.out.printf("%d볼 ", ballCount);
        }

        if (strikeCount > NOTHING) {
            System.out.printf("%d스트라이크", strikeCount);
        }

        System.out.println();
    }

    private void emptyNumber(int ballCount,int strikeCount) {
        if (ballCount == NOTHING && strikeCount == NOTHING) {
            System.out.println("낫싱");
            return;
        }
    }

    private void correctAnswer(int strikeCount) {
        if (strikeCount == OUT) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
    }

}

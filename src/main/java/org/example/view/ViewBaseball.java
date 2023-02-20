package org.example.view;

public class ViewBaseball {

    private final int THREE_STRIKE = 3;
    private final int ZERO = 0;
    private final String TRUE_NUM = "정답입니다";
    private final String NOTHING = "낫싱";

    private int ball;
    private int strike;

    public ViewBaseball(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public static void inputMessage() {
        System.out.print("숫자를 입력해주세요: ");
    }

    public void hasNotBallOrStrike() {
        if (ball == ZERO && strike == ZERO) {
            System.out.println(NOTHING);
        }
    }

    public void hasBallAndStrike() {
        if (ball > ZERO || strike > ZERO) {
            System.out.println(ball + "볼 " + strike + "스트라이크");
        }
    }

    public boolean correctAnswer() {
        if (strike == THREE_STRIKE) {
            System.out.println(TRUE_NUM);
            return true;
        }
        return false;
    }

    public static void reGameMessage() {
        System.out.print("게임을 다시 시작하시겠습니까?(y/n): ");
    }
}

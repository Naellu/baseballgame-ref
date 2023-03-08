package org.example.model;

import java.util.List;

import static org.example.model.ConstValues.BALL;
import static org.example.model.ConstValues.BALL_STRIKE_LENGTH;
import static org.example.model.ConstValues.STRIKE;
import static org.example.model.ConstValues.ZERO;

public class Referee implements Comparison {

    private int[] ballAndStrike = new int[BALL_STRIKE_LENGTH];

    /**
     *
     * @param userNumbers 유저의 숫자
     * @param computerNumbers 컴퓨터의 숫자
     */

    @Override
    public int[] comparePlayerNumbers(List<String> userNumbers, List<String> computerNumbers) {
        countBall(userNumbers, computerNumbers);
        countStrike(userNumbers, computerNumbers);
        return ballAndStrike;
    }

    private void countBall(List<String> userNumbers, List<String> computerNumbers) {
        int ball = ZERO;
        for (int i = ZERO; i < userNumbers.size(); i++) {
            if (!userNumbers.get(i).equals(computerNumbers.get(i))
                    && computerNumbers.contains(userNumbers.get(i))) {
                ball++;
            }
        }
        ballAndStrike[BALL] = ball;
    }

    private void countStrike(List<String> userNumbers, List<String> computerNumbers) {
        int strike = ZERO;
        for (int i = ZERO; i < userNumbers.size(); i++) {
            if (userNumbers.get(i).equals(computerNumbers.get(i))) {
                strike++;
            }
        }
        ballAndStrike[STRIKE] = strike;
    }

}

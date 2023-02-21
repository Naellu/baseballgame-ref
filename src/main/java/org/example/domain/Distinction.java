package org.example.domain;

import java.util.List;

public class Distinction {

    public int hasStrike(List<String > userNumbers, List<String> computerNumbers) {
        int strikeNum = 0;
        return loopStrike(userNumbers, computerNumbers, strikeNum);
    }

    private static int loopStrike(List<String> userNumbers, List<String> computerNumbers, int strike) {
        for (int i = 0; i < computerNumbers.size(); i++) {
            strike = isStrike(userNumbers, computerNumbers, strike, i);
        }
        return strike;
    }

    private static int isStrike(List<String> userNumbers, List<String> computerNumbers, int strike, int i) {
        if (userNumbers.get(i).equals(computerNumbers.get(i))) {
            strike++;
        }
        return strike;
    }

    public int hasBall(List<String > userNumbers, List<String> computerNumbers) {
        int ball = 0;

        ball = loopBall(userNumbers, computerNumbers, ball);
        return ball;
    }

    private static int loopBall(List<String> userNumbers, List<String> computerNumbers, int ball) {
        for (int i = 0; i < computerNumbers.size(); i++) {
            ball = isBall(userNumbers, computerNumbers, ball, i);
        }
        return ball;
    }

    private static int isBall(List<String> userNumbers, List<String> computerNumbers, int ball, int i) {
        if (!userNumbers.get(i).equals(computerNumbers.get(i))
                && computerNumbers.contains(userNumbers.get(i))) {
            ball++;
        }
        return ball;
    }


}

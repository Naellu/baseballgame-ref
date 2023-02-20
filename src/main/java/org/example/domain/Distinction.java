package org.example.domain;

import java.util.List;

public class Distinction {

    public int hasStrike(List<String > userNumbers, List<String> computerNumbers) {
        int strike = 0;

        for (int i = 0; i < computerNumbers.size(); i++) {
            if (userNumbers.get(i).equals(computerNumbers.get(i))) {
                strike++;
            }
        }
        return strike;
    }

    public int hasBall(List<String > userNumbers, List<String> computerNumbers) {
        int ball = 0;

        for (int i = 0; i < computerNumbers.size(); i++) {
            if (!userNumbers.get(i).equals(computerNumbers.get(i))
                    && computerNumbers.contains(userNumbers.get(i))) {
                ball++;
            }
        }
        return ball;
    }


}

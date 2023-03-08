package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static org.example.model.ConstValues.NUM_INPUT_LIMIT;
import static org.example.model.ConstValues.ONE;
import static org.example.model.ConstValues.RANDOM_MAX_NUM;

public class Computer {

    private List<String> computerNumbers;

    private int randomNumber() {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        return threadLocalRandom.nextInt(RANDOM_MAX_NUM) + ONE;
    }

    private void initThreeNumbers() {
        computerNumbers = new ArrayList<>();
        while (computerNumbers.size() < NUM_INPUT_LIMIT) {
            String randomNumbers = String.valueOf(randomNumber());
            if (!computerNumbers.contains(randomNumbers))
                this.computerNumbers.add(randomNumbers);
        }
    }

    public List<String> initNumbers() {
        initThreeNumbers();
        return computerNumbers;
    }
}

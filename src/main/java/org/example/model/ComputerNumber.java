package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ComputerNumber {

    private static final int NUM_LIMIT = 9;
    private static final int ONE = 1;
    private static final int MAX_SIZE = 3;

    private List<String> computerNumbers = new ArrayList<>();

    public List<String> getComputerNum() {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        while (computerNumbers.size() < MAX_SIZE) {
            String num = String.valueOf((random.nextInt(NUM_LIMIT) + ONE));
            if (!computerNumbers.contains(num)) {
                computerNumbers.add(num);
            }
        }
        return computerNumbers;
    }

    @Override
    public String toString() {
        return "computerNumbers=" + computerNumbers;
    }
}

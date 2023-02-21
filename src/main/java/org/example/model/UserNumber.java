package org.example.model;

import org.example.valid.Validation;

import java.util.ArrayList;
import java.util.List;

public class UserNumber {

    private List<String> userNumbers;

    public UserNumber() {
        userNumbers = new ArrayList<>();
    }

    public List<String> getUserNum(String userInput) {
        Validation.ValidString(userInput);
        putEachUserNum(userInput);
        return userNumbers;
    }

    private void putEachUserNum(String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            userNumbers.add(userInput.substring(i, i + 1));
        }
    }

    @Override
    public String toString() {
        return "userNumbers=" + userNumbers;
    }
}

package org.example.valid;

import java.util.regex.Pattern;

public class Validation {

    private static final int DEFALUT_LENGTH = 3;

    public static boolean ValidString(String userInput) {
        if (isNum(userInput)
                || isLengthThree(userInput)
                || isSameNumber(userInput)) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    public static boolean isNum(String userInput) {
        if (!Pattern.matches("[1-9]+", userInput)) {
            return true;
        }
        return false;
    }

    public static boolean isLengthThree(String userInput) {
        if (userInput.length() < DEFALUT_LENGTH || userInput.length() > DEFALUT_LENGTH) {
            return true;
        }
        return false;
    }

    public static boolean isSameNumber(String userInput) {
        if (userInput.charAt(0) == userInput.charAt(1) ||
                userInput.charAt(1) == userInput.charAt(2) ||
                userInput.charAt(0) == userInput.charAt(2)) {

            return true;
        }
        return false;
    }
}

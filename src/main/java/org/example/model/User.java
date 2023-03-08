package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.example.model.ConstValues.NUM_INPUT_LIMIT;
import static org.example.model.ConstValues.NUM_REGEX;

/**
 * 기능 목록
 * 1. 숫자 검증하기
 * 2. 숫자 자릿수별로 쪼개기
 */
public class User {

    private List<String> UserNumbers;

    public List<String> initUserThreeNumber() {
        return UserNumbers;
    }

    public User(String number) {
        this.UserNumbers = new ArrayList<>();
        validateNumber(number);
        validateLength(number);
        validateDuplicateNumber(number);
        divideNum(number);
    }

    private void divideNum(String inputTypingNumber) {
        this.UserNumbers = Stream.of(inputTypingNumber.split(""))
                .collect(Collectors.toList());
    }

    private void validateNumber(String number) {
        if (!Pattern.matches(NUM_REGEX, number)) {
            throw new IllegalArgumentException("숫자만 입력해주세요");
        }
    }

    private void validateLength(String number) {
        if (number.length() > NUM_INPUT_LIMIT) {
            throw new IllegalArgumentException("세자리 숫자로만 입력해주세요");
        }
    }

    private void validateDuplicateNumber(String number) {
        int normalNumber = (int) Stream.of(number.split("")).distinct().count();
        if (normalNumber != 3) {
            throw new IllegalArgumentException("중복된 숫자가 있습니다");
        }
    }
}

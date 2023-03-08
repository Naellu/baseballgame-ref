package org.example.model;

import java.util.Scanner;

/**
 * 기능 목록
 * 1. 숫자 입력받기
 */
public class Number {

    private String inputNumber;

    private void makeNumberToInput() {
        Scanner scanner = new Scanner(System.in);
        this.inputNumber = scanner.nextLine();
    }

    public String typingThreeLengthNumber() {
        makeNumberToInput();
        return inputNumber;
    }

}

package org.example.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNumber {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static String inputUserNumber() throws IOException {
        return input.readLine();
    }
}

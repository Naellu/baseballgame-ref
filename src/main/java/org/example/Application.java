package org.example;

import org.example.controller.BaseballController;

public class Application {
    public static void main(String[] args) {
        BaseballController controller = new BaseballController();
        controller.playGame();
    }
}

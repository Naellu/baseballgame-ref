package org.example;

import org.example.domain.Distinction;
import org.example.model.ComputerNumber;
import org.example.model.InputNumber;
import org.example.model.UserNumber;
import org.example.valid.Validation;
import org.example.view.ViewBaseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class RunAndReplay {

    public void runAndRestart() {
        BufferedReader reGameInput = new BufferedReader(new InputStreamReader(System.in));

        try {
            ViewBaseball.reGameMessage();
            String reGameAnswer = reGameInput.readLine();
            if (reGameAnswer.equals("y")) {
                run();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void run() throws IOException {
//        ComputerNumber computerNum = ComputerNumber.of();
        Distinction distinction = new Distinction();

        List<String> computerNumbers = ComputerNumber.createNumbers().getComputerNum();

        while (true) {
            UserNumber userNum = new UserNumber();

            ViewBaseball.inputMessage();
            String userInput = InputNumber.inputUserNumber();
            Validation.ValidString(userInput);

            List<String> userNumbers = userNum.getUserNum(userInput);

            int ball = distinction.hasBall(userNumbers, computerNumbers);
            int strike = distinction.hasStrike(userNumbers, computerNumbers);
            ViewBaseball vbb = new ViewBaseball(ball, strike);
            vbb.hasBallAndStrike();
            vbb.hasNotBallOrStrike();

            if (vbb.correctAnswer()) {
                runAndRestart();
                break;
            }
        }
    }

}

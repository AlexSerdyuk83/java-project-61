package hexlet.code.games;

import hexlet.code.Helpers;
import hexlet.code.Strings;

import java.util.Scanner;

public class GCDGame {
    static final int MAX = 100;

    public static int getGcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGcd(n2, n1 % n2);
    }
    public static boolean game(String userName, Scanner sc) {
        System.out.println(Strings.getGCDTaskText());

        var i = Helpers.getGameStepCount();
        var counter = 0;

        while (i != 0) {
            var taskNumbers = Helpers.getTaskValues(MAX);
            var firstNumber = taskNumbers[0];
            var secondNumber = taskNumbers[1];

            var taskText = String.format("%d %d", firstNumber, secondNumber);

            String correctAnswer = String.valueOf(getGcd(firstNumber, secondNumber));

            var text = String.format(Strings.getStringQuestionText(), taskText);
            var stepResults = Helpers.getGameStepResult(
                    sc,
                    text,
                    counter,
                    i,
                    userName,
                    correctAnswer
            );

            counter = stepResults[0];
            i = stepResults[1];
        }

        return counter == Helpers.getGameStepCount();
    }
}

package hexlet.code.games;

import hexlet.code.Helpers;
import hexlet.code.Strings;

import java.util.Scanner;

import static hexlet.code.Helpers.getGameStepResult;
import static hexlet.code.Helpers.getRandomNumber;
import static hexlet.code.Helpers.getGameStepCount;

public class PrimeGame {
    static final int MIN = 1;
    static final int MAX = 100;

    public static boolean isPrime(Integer number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean game(String userName, Scanner sc) {
        System.out.println(Strings.getPrimeTaskText());

        var i = getGameStepCount();
        var counter = 0;

        while (i != 0) {
            var taskNumber = getRandomNumber(MIN, MAX);
            var correctAnswer = isPrime(taskNumber) ? "yes" : "no";

            var text = String.format(Strings.getNumberQuestionText(), taskNumber);

            var stepResults = getGameStepResult(
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

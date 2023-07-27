package hexlet.code.games;

import hexlet.code.Strings;

import static hexlet.code.Helpers.getGameStepResult;
import static hexlet.code.Helpers.getRandomNumber;
import static hexlet.code.Helpers.getGameStepCount;

import java.util.Scanner;

public class EvenGame {
    static final int MIN = 1;
    static final int MAX = 100;
    static boolean isEven(int number) {
        return number == 0;
    }

    static String getCorrectAnswer(int number) {
        return isEven(number) ? "yes" : "no";
    }

    public static boolean game(String userName, Scanner sc) {
        System.out.println(Strings.getEvenTaskText());

        var i = getGameStepCount();
        var counter = 0;

        while (i != 0) {
            var taskNumber = getRandomNumber(MIN, MAX);
            var taskEven = taskNumber % 2;
            var correctAnswer = getCorrectAnswer(taskEven);

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

        return counter == getGameStepCount();
    }
}

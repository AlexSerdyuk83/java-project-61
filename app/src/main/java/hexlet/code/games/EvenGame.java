package hexlet.code.games;

import hexlet.code.Strings;

import static hexlet.code.Helpers.getGameStepResult;
import static hexlet.code.Helpers.getRandomNumber;

import java.util.Scanner;

public class EvenGame {
    static boolean isEven(int number) {
        return number == 0;
    }

    static String getCorrectAnswer(int number) {
        return isEven(number) ? "yes" : "no";
    }

    public static boolean even(String userName, Scanner sc) {
        System.out.println(Strings.evenTaskTextText);

        var i = 3;
        var counter = 0;

        while (i != 0) {
            var taskNumber = getRandomNumber(1, 100);
            var taskEven = taskNumber % 2;
            var correctAnswer = getCorrectAnswer(taskEven);

            var text = String.format(Strings.numberQuestionText, taskNumber);

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

        return counter == 3;
    }
}

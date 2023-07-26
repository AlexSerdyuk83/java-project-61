package hexlet.code.games;

import hexlet.code.Strings;

import java.util.Scanner;

public class EvenGame {
    static boolean isEven(int number) {
        return number == 0;
    }

    static String getCorrectAnswer(int number) {
        return isEven(number) ? "yes" : "no";
    }

    static int getRandomNumber() {
        return (int) ((Math.random() + 1) * 100);
    }

    public static void even(String userName, Scanner sc) {
        System.out.println(Strings.evenTaskTextText);

        var i = 3;
        var counter = 0;

        while (i != 0) {
            var taskNumber = getRandomNumber();
            var taskEven = taskNumber % 2;
            var correctAnswer = getCorrectAnswer(taskEven);

            var text = String.format(Strings.questionText, taskNumber);

            System.out.println(text);
            System.out.print(Strings.answerText);

            String usersAnswer = sc.next();

            if (usersAnswer.equals(correctAnswer)) {
                System.out.println(Strings.correctText);
                counter++;
                i--;
            } else {
                var wrongText = String.format(
                        Strings.wrongSchemeText,
                        usersAnswer,
                        correctAnswer
                );
                var bayText = String.format(Strings.tryAgainText, userName);

                System.out.println(wrongText);
                System.out.println(bayText);
                i = 0;
            }
        }

        if (counter == 3) {
            var resultText = String.format(Strings.congratulationsText, userName);
            System.out.println(resultText);
        }
    }
}

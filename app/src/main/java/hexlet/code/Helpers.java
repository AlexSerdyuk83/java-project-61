package hexlet.code;

import java.util.Scanner;

public class Helpers {
    public static int getRandomNumber(int coefficient, int max) {
        return (int) ((Math.random() + coefficient) * max);
    }

    public static int[] getGameStepResult(
            Scanner sc,
            String questionText,
            int counter,
            int i,
            String userName,
            String correctAnswer
    ) {
        var currentCounter = counter;
        var currentI = i;

        System.out.println(questionText);
        System.out.print(Strings.answerText);

        String usersAnswer = sc.next();

        if (usersAnswer.equals(correctAnswer)) {
            System.out.println(Strings.correctText);
            currentCounter++;
            currentI--;
        } else {
            var wrongText = String.format(
                    Strings.wrongSchemeText,
                    usersAnswer,
                    correctAnswer
            );
            var bayText = String.format(Strings.tryAgainText, userName);

            System.out.println(wrongText);
            System.out.println(bayText);
            currentI = 0;
        }

        return new int[]{currentCounter, currentI};
    }
}

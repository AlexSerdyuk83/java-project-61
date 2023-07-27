package hexlet.code;

import java.util.Scanner;

public class Helpers {
    static final int defaultMax = 10;
    static final int defaultCoefficient = 1;
    static final int gameStepCount = 3;

    public static int getGameStepCount() {
        return gameStepCount;
    }
    public static int getRandomNumber(int coefficient, int max) {
        return (int) ((Math.random() + coefficient) * max);
    }

    public static int[] getTaskValues(int max) {
        return new int[]{getRandomNumber(defaultCoefficient, max), getRandomNumber(defaultCoefficient, max)};
    }

    public static int[] getTaskValues() {
        return getTaskValues(defaultMax);
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
        System.out.print(Strings.getAnswerText());

        String usersAnswer = sc.next();

        if (usersAnswer.equals(correctAnswer)) {
            System.out.println(Strings.getCorrectText());
            currentCounter++;
            currentI--;
        } else {
            var wrongText = String.format(
                    Strings.getWrongSchemeText(),
                    usersAnswer,
                    correctAnswer
            );
            var bayText = String.format(Strings.getTryAgainText(), userName);

            System.out.println(wrongText);
            System.out.println(bayText);
            currentI = 0;
        }

        return new int[]{currentCounter, currentI};
    }
}

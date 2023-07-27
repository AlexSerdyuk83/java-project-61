package hexlet.code.games;

import hexlet.code.Helpers;
import hexlet.code.Strings;

import java.util.Scanner;

public class ProgressionGame {
    static final int stepCoefficient = 0;
    static final int startCoefficient = 1;
    static final int startMax = 100;
    static final int stepMax = 10;
    static final int positionMax = 9;
    public static String[] getProgression() {
        var start = Helpers.getRandomNumber(startCoefficient, startMax);
        var step = Helpers.getRandomNumber(startCoefficient, stepMax);
        var random = Helpers.getRandomNumber(stepCoefficient, positionMax);
        var position = random == 0 ? 1 : random;

        var acc = start;
        var progression = new StringBuilder(acc);
        String value = String.valueOf(acc);

        for (var i = 1; i < 11; i++) {

            if (i == position) {
                progression.append(".. ");
                value = String.valueOf(acc);
            } else {
                progression.append(acc).append(" ");
            }

            acc += step;
        }

        return new String[]{progression.toString().trim(), value};
    }

    public static boolean game(String userName, Scanner sc) {
        System.out.println(Strings.getProgressionTaskText());

        var i = Helpers.getGameStepCount();
        var counter = 0;

        while (i != 0) {
            var progressionData = getProgression();
            var taskProgression = progressionData[0];
            var correctAnswer = progressionData[1];

            var text = String.format(Strings.getStringQuestionText(), taskProgression);

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

        return counter == 3;
    }
}

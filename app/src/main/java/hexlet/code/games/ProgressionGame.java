package hexlet.code.games;

import hexlet.code.Helpers;
import hexlet.code.Strings;

import java.util.Scanner;

public class ProgressionGame {
    static final int STEP_COEFFICIENT = 0;
    static final int START_COEFFICIENT = 1;
    static final int START_MAX = 100;
    static final int STEP_MAX = 10;
    static final int POSITION_MAX = 9;

    static final int PROGRESSIVE_LEN = 11;
    public static String[] getProgression() {
        var start = Helpers.getRandomNumber(START_COEFFICIENT, START_MAX);
        var step = Helpers.getRandomNumber(START_COEFFICIENT, STEP_MAX);
        var random = Helpers.getRandomNumber(STEP_COEFFICIENT, POSITION_MAX);
        var position = random == 0 ? 1 : random;

        var acc = start;
        var progression = new StringBuilder(acc);
        String value = String.valueOf(acc);

        for (var i = START_COEFFICIENT; i < PROGRESSIVE_LEN; i++) {

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

        return counter == Helpers.getGameStepCount();
    }
}

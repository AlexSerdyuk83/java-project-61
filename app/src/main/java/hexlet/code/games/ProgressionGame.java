package hexlet.code.games;

import hexlet.code.Helpers;
import hexlet.code.Strings;

import java.util.Scanner;

import static hexlet.code.Helpers.getGameStepResult;

public class ProgressionGame {
    public static String[] getProgression() {
        var start = Helpers.getRandomNumber(1, 100);
        var step = Helpers.getRandomNumber(1, 10);
        var random = Helpers.getRandomNumber(0, 9);
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
        System.out.println(Strings.progressionTaskText);

        var i = 3;
        var counter = 0;

        while (i != 0) {
            var progressionData = getProgression();
            var taskProgression = progressionData[0];
            var correctAnswer = progressionData[1];

            var text = String.format(Strings.stringQuestionText, taskProgression);

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

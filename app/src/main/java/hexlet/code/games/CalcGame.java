package hexlet.code.games;

import hexlet.code.Helpers;
import hexlet.code.Strings;
import static hexlet.code.Helpers.getGameStepCount;

import java.util.Scanner;

public class CalcGame {
    static final int MIN = 0;
    static final int MAX = 3;
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static int getSum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static int getDiff(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public static int getMultiplication(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public static int getResultValue(int firstNum, int secondNum, int operation) {
        return switch (operation) {
            case 1 -> getDiff(firstNum, secondNum);
            case 2 -> getMultiplication(firstNum, secondNum);
            default -> getSum(firstNum, secondNum);
        };
    }

    public static boolean game(String userName, Scanner sc) {
        System.out.println(Strings.getCalcTaskText());

        var i = getGameStepCount();
        var counter = 0;

        while (i != 0) {
            var taskNumbers = Helpers.getTaskValues();
            var operationNumber = Helpers.getRandomNumber(MIN, MAX);
            var firstNumber = taskNumbers[0];
            var secondNumber = taskNumbers[1];
            var operator = OPERATORS[operationNumber];

            var taskText = String.format("%d %s %d", firstNumber, operator, secondNumber);

            String correctAnswer = String.valueOf(getResultValue(firstNumber, secondNumber, operationNumber));

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

        return counter == getGameStepCount();
    }
}

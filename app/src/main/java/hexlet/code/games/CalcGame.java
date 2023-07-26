package hexlet.code.games;

import hexlet.code.Strings;

import java.util.Scanner;

import static hexlet.code.Helpers.getGameStepResult;
import static hexlet.code.Helpers.getRandomNumber;

public class CalcGame {
    static String[] operators = {"+", "-", "*"};

    public static int[] getTaskValues() {
        int[] result = {getRandomNumber(1, 10), getRandomNumber(1, 10)};
        return result;
    }

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

    public static boolean calc(String userName, Scanner sc) {
        System.out.println(Strings.calcTaskText);

        var i = 3;
        var counter = 0;

        while (i != 0) {
            var taskNumbers = getTaskValues();
            var operationNumber = getRandomNumber(0, 3);
            var firstNumber = taskNumbers[0];
            var secondNumber = taskNumbers[1];
            var operator = operators[operationNumber];

            var taskText = String.format("%d %s %d", firstNumber, operator, secondNumber);

            String correctAnswer = String.valueOf(getResultValue(firstNumber, secondNumber, operationNumber));

            var text = String.format(Strings.stringQuestionText, taskText);

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

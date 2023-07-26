package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class Engine {
    public static void game(int gameNumber, String userName, Scanner sc) {
        boolean isWin = switch (gameNumber) {
            case 2 -> EvenGame.even(userName, sc);
            case 3 -> CalcGame.calc(userName, sc);
            default -> false; // For case 1
        };

        if (isWin) {
            var resultText = String.format(Strings.congratulationsText, userName);
            System.out.println(resultText);
        }
    }
}

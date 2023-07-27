package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class Engine {
    public static void game(int gameNumber, String userName, Scanner sc) {
        boolean isWin = switch (gameNumber) {
            case 2 -> EvenGame.game(userName, sc);
            case 3 -> CalcGame.game(userName, sc);
            case 4 -> GCDGame.game(userName, sc);
            case 5 -> ProgressionGame.game(userName, sc);
            case 6 -> PrimeGame.game(userName, sc);
            default -> false; // For case 1
        };

        if (isWin) {
            var resultText = String.format(Strings.congratulationsText, userName);
            System.out.println(resultText);
        }
    }
}

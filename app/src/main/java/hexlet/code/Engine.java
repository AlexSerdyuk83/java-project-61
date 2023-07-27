package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class Engine {
    static final int evenGameNumber = 2;
    static final int calcGameNumber = 3;
    static final int gcdGameNumber = 4;
    static final int progressGameNumber = 5;
    static final int primeGameNumber = 6;

    public static void game(int gameNumber, String userName, Scanner sc) {
        boolean isWin = switch (gameNumber) {
            case evenGameNumber -> EvenGame.game(userName, sc);
            case calcGameNumber -> CalcGame.game(userName, sc);
            case gcdGameNumber -> GCDGame.game(userName, sc);
            case progressGameNumber -> ProgressionGame.game(userName, sc);
            case primeGameNumber -> PrimeGame.game(userName, sc);
            default -> false; // For case 1
        };

        if (isWin) {
            var resultText = String.format(Strings.getCongratulationsText(), userName);
            System.out.println(resultText);
        }
    }
}

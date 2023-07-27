package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class Engine {
    static final int EVEN_GAME_NUMBER = 2;
    static final int CALC_GAME_NUMBER = 3;
    static final int GCD_GAME_NUMBER = 4;
    static final int PROGRESS_GAME_NUMBER = 5;
    static final int PRIME_GAME_NUMBER = 6;

    public static void game(int gameNumber, String userName, Scanner sc) {
        boolean isWin = switch (gameNumber) {
            case EVEN_GAME_NUMBER -> EvenGame.game(userName, sc);
            case CALC_GAME_NUMBER -> CalcGame.game(userName, sc);
            case GCD_GAME_NUMBER -> GCDGame.game(userName, sc);
            case PROGRESS_GAME_NUMBER -> ProgressionGame.game(userName, sc);
            case PRIME_GAME_NUMBER -> PrimeGame.game(userName, sc);
            default -> false; // For case 1
        };

        if (isWin) {
            var resultText = String.format(Strings.getCongratulationsText(), userName);
            System.out.println(resultText);
        }
    }
}

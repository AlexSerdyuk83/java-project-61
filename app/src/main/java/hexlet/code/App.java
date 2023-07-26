package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Greeting.makeGreeting;

public class App {
    static String[] games = {"1 - Greet", "2 - Even", "3 - Calc", "0 - Exit"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Strings.chooseGameText);

        for (var game : games) {
            System.out.println(game);
        }

        System.out.print(Strings.chosenText);

        int chosenGame = sc.nextInt();

        if (chosenGame == 0) {
            sc.close();
            return;
        }

        var userName = makeGreeting(sc);

        Engine.game(chosenGame, userName, sc);

        sc.close();
    }
}

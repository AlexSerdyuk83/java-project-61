package hexlet.code;

import hexlet.code.games.EvenGame;

import java.util.Scanner;

import static hexlet.code.Greeting.makeGreeting;

public class App {
    static String[] games = {"1 - Greet", "2 - Even", "0 - Exit"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Strings.chooseGameText);

        for (var game : games) {
            System.out.println(game);
        }

        System.out.print(Strings.chosenText);

        String chosenGame = sc.next();

        if (chosenGame.equals("0")) {
            sc.close();
            return;
        }

        var userName = makeGreeting(sc);

        switch (chosenGame) {
            case "2":
                EvenGame.even(userName, sc);
                break;
            default: // For case 1
                break;
        }

        sc.close();
    }
}

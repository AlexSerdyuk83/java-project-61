package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greating() {
        var greatText = "Welcome to the Brain Games!";
        var getInputText = "May I have your name? ";

        Scanner sc = new Scanner(System.in);

        System.out.println(greatText);
        System.out.print(getInputText);

        String name = sc.next();


        System.out.println("Hello, " + name + "!");

        sc.close();
    }
}

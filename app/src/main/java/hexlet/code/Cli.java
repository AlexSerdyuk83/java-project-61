package hexlet.code;

import java.util.Scanner;

public class Cli {
    static String greatText = "Welcome to the Brain Games!";
    static String getInputText = "May I have your name? ";

    public static void greeting() {
        Scanner sc = new Scanner(System.in);

        System.out.println(greatText);
        System.out.print(getInputText);

        String name = sc.next();

        System.out.println("Hello, " + name + "!");

        sc.close();
    }
}

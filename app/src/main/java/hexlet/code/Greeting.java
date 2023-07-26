package hexlet.code;

import java.util.Scanner;

public class Greeting {
    public static String makeGreeting(Scanner sc) {
        System.out.println(Strings.welcomeText);
        System.out.print(Strings.getInputNameText);

        String name = sc.next();

        System.out.println("Hello, " + name + "!");

        return name;
    }
}

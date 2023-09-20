package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String greetingsUser(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String userName = scanner.next();
        var greetings = "Hello, " + userName + "!";

        scanner.close();
        return greetings;
    }
}

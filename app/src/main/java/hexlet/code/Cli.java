package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String name;
    public static void greetings() {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}

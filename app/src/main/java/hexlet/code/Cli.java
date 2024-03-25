package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String name;
    public Cli(String name) {
        Cli.name = name;
    }
    public static String getName() {
        return name;
    }
    public static void greetings() {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}

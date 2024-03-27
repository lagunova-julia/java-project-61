package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String greetings() {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}

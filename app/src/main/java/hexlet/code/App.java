package hexlet.code;
import java.util.Scanner;

public class App {
    private static int gameNumber; // добавила модификатор
    private static String userName; // добавила модификатор
    public static final int GAME_OVER = 6;

    public static String getUserName() {
        return userName;
    }

    public static String getGameNumber() {
        return String.valueOf(gameNumber);
    }

    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n"
                + "Your choice: ");
        Scanner sc = new Scanner(System.in);
        gameNumber = sc.nextInt();
        if (gameNumber == 0 || gameNumber > GAME_OVER) {
            System.exit(0);
        } else {
            System.out.println("Welcome to the Brain Games!");
            userName = Cli.greetings();
            System.out.println("Hello, " + userName + "!");
            if (gameNumber == 1) {
                System.exit(0);
            }
        }
        Engine.prepareGame();
    }
}

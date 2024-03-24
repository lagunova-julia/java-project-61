package hexlet.code;

import java.util.Scanner;

public class App {
    static int gameNumber;
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "0 - Exit\n" +
                "Your choice: ");
        Scanner sc = new Scanner(System.in);
        gameNumber = sc.nextInt();
        if (gameNumber != 0) {
            System.out.println("Welcome to the Brain Games!");
            Cli.greetings();
        }
        Engine.prepareGame();
        Engine.playGame();
    }
}

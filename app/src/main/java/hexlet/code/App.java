package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static int gameNumber;
    private static String userName;
    public static final int GAME_OVER = 6;

    public static String getUserName() {
        return userName;
    }

    public static int getGameNumber() {
        return gameNumber;
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
        chooseGame();
    }

    public static void chooseGame() {
        int gameNumber = App.getGameNumber();

        switch (gameNumber) {
            case Engine.GAME_EVEN:
                Even.makeGame();
                break;
            case Engine.GAME_CALC:
                Calc.makeGame();
                break;
            case Engine.GAME_GCD:
                GCD.makeGame();
                break;
            case Engine.GAME_PROGRESSION:
                Progression.makeGame();
                break;
            case Engine.GAME_PRIME:
                Prime.makeGame();
                break;
        }
    }
}

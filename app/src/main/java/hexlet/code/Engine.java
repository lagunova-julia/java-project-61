package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int SAVE_DATA = 2;
    public static final int GAME_EVEN = 2;
    public static final int GAME_CALC = 3;
    public static final int GAME_GCD = 4;
    public static final int GAME_PROGRESSION = 5;
    public static final int GAME_PRIME = 6;
    public static final int NUMBERS_COUNT = 100;

    public static void playGame(String question, String[][] gameData) {

        System.out.println(question);
        int count = 0;
        int i = 0;
        String userName = App.getUserName();
        do {
            String roundQuestion = gameData[i][0];
            String roundAnswer = gameData[i][1];
            System.out.print("Question: " + roundQuestion + "\nYour answer: ");
            Scanner sc = new Scanner(System.in);
            String playerAnswer = sc.nextLine();

            if (roundAnswer.equals(playerAnswer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + playerAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + roundAnswer
                        + "'.\n"
                        + "Let's try again, " + userName + "!");
                System.exit(0);
            }
            i++;
        }
        while (count < ROUNDS_COUNT);
        System.out.println("Congratulations, " + userName + "!");
    }
}

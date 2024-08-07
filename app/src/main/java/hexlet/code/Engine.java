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
        int i = 0;
        String userName = App.getUserName();
        for (int count = 0; count < ROUNDS_COUNT; count++) {
            String roundQuestion = gameData[i][0];
            String roundAnswer = gameData[i][1];
            System.out.print("Question: " + roundQuestion + "\nYour answer: ");
            Scanner sc = new Scanner(System.in);
            String playerAnswer = sc.nextLine();

            if (roundAnswer.equals(playerAnswer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + playerAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + roundAnswer
                        + "'.\n"
                        + "Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}

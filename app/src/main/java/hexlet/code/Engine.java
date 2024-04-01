package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    private static String mainQuestion;
    private static String roundQuestion;
    private static String roundAnswer;
    public static String getMainQuestion() {
        return mainQuestion;
    }
    public static String getRoundQuestion() {
        return roundQuestion;
    }
    public static String getRoundAnswer() {
        return roundAnswer;
    }
    public static final int ROUNDS_COUNT = 3;
    //public static final int SAVE_DATA = 2;
    public static final int GAME_EVEN = 2;
    public static final int GAME_CALC = 3;
    public static final int GAME_GCD = 4;
    public static final int GAME_PROGRESSION = 5;
    public static final int GAME_PRIME = 6;

    public static void prepareGame() {
        int gameNumber = Integer.parseInt(App.getGameNumber());
        if (gameNumber == GAME_EVEN) {
            mainQuestion = Even.mainQuestion();
            Even.generateRoundData();
            roundQuestion = Even.getRoundQuestion();
            roundAnswer = Even.getRoundAnswer();
        } else if (gameNumber == GAME_CALC) {
            mainQuestion = Calc.mainQuestion();
            Calc.generateRoundData();
            roundQuestion = Calc.getRoundQuestion();
            roundAnswer = Calc.getRoundAnswer();
        } else if (gameNumber == GAME_GCD) {
            mainQuestion = GCD.mainQuestion();
            GCD.generateRoundData();
            roundQuestion = GCD.getRoundQuestion();
            roundAnswer = GCD.getRoundAnswer();
        } else if (gameNumber == GAME_PROGRESSION) {
            mainQuestion = Progression.mainQuestion();
            Progression.generateRoundData();
            roundQuestion = Progression.getRoundQuestion();
            roundAnswer = Progression.getRoundAnswer();
        } else if (gameNumber == GAME_PRIME) {
            mainQuestion = Prime.mainQuestion();
            Prime.generateRoundData();
            roundQuestion = Prime.getRoundQuestion();
            roundAnswer = Prime.getRoundAnswer();
        }
    }

    public static void playGame() {
        // здесь формируется и выводится вопрос игры
        System.out.println(mainQuestion);
        int count = 0;
        String userName = App.getUserName();
        do {
            System.out.print("Question: " + roundQuestion + "\nYour answer: ");
            Scanner sc = new Scanner(System.in);
            String playerAnswer = sc.nextLine();

            if (roundAnswer.equals(playerAnswer)) {
                System.out.println("Correct!");
                prepareGame();
                count++;
            } else {
                System.out.println("'" + playerAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + roundAnswer
                        + "'.\n"
                        + "Let's try again, " + userName + "!");
                System.exit(0);
            }
        }
        while (count < ROUNDS_COUNT);
        System.out.println("Congratulations, " + userName + "!");
    }
}

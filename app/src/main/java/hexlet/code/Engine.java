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

    /*private static void fillRoundsData() {
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            roundsData[i] = Even.generateRoundData();
        }
    }*/

    public static void prepareGame() {
        int gameNumber = Integer.parseInt(App.getGameNumber());
        //String mainQuestion = "";
        if (gameNumber == GAME_EVEN) {
            mainQuestion = Even.mainQuestion();
            Even.generateRoundData();
            //String[] roundData = Even.generateRoundData(); // массив ответ-вопрос
            roundQuestion = Even.getRoundQuestion();
            roundAnswer = Even.getRoundAnswer();
            //fillRoundsData();
            /*for (int i = 0; i < ROUNDS_COUNT; i++) {
                roundsData[i] = Even.generateRoundData();
            }*/
        } else if (gameNumber == GAME_CALC) {
            mainQuestion = Calc.mainQuestion();
            Calc.generateRoundData();
            //String[] roundData = Calc.generateRoundData(); // массив ответ-вопрос
            roundQuestion = Calc.getRoundQuestion();
            roundAnswer = Calc.getRoundAnswer();
            /*for (int i = 0; i < ROUNDS_COUNT; i++) {
                roundsData[i] = Calc.generateRoundData();
            }*/
        } else if (gameNumber == GAME_GCD) {
            mainQuestion = GCD.mainQuestion();
            GCD.generateRoundData();
            //String[] roundData = GCD.generateRoundData(); // массив ответ-вопрос
            roundQuestion = GCD.getRoundQuestion();
            roundAnswer = GCD.getRoundAnswer();
            /*for (int i = 0; i < ROUNDS_COUNT; i++) {
                roundsData[i] = GCD.generateRoundData();
            }*/
        } else if (gameNumber == GAME_PROGRESSION) {
            mainQuestion = Progression.mainQuestion();
            Progression.generateRoundData();
            //String[] roundData = Progression.generateRoundData(); // массив ответ-вопрос
            roundQuestion = Progression.getRoundQuestion();
            roundAnswer = Progression.getRoundAnswer();
            /*for (int i = 0; i < ROUNDS_COUNT; i++) {
                roundsData[i] = Progression.generateRoundData();
            }*/
        } else if (gameNumber == GAME_PRIME) {
            mainQuestion = Prime.mainQuestion();
            Prime.generateRoundData();
            //String[] roundData = Prime.generateRoundData(); // массив ответ-вопрос
            roundQuestion = Prime.getRoundQuestion();
            roundAnswer = Prime.getRoundAnswer();
            /*for (int i = 0; i < ROUNDS_COUNT; i++) {
                roundsData[i] = Prime.generateRoundData();
            }*/
        }
        //playGame(mainQuestion, roundsData);
    }

    public static void playGame() {
        // здесь формируется и выводится вопрос игры
        System.out.println(mainQuestion);
        int count = 0;
        String userName = App.getUserName();
        do {
            //String roundQuestion = gameData[i][0];
            //String roundAnswer = gameData[i][1];
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
            //i++;
        }
        while (count < ROUNDS_COUNT);
        System.out.println("Congratulations, " + userName + "!");
    }
}

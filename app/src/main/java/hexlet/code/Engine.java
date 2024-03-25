package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    private static String question1;
    private static String question2;
    private static String correctAnswer;
    public Engine(String question1, String question2, String correctAnswer) {
        this.question1 = question1;
        this.question2 = question2;
        this.correctAnswer = correctAnswer;
    }
    public static String getQuestion1() {
        return question1;
    }
    public static String getQuestion2() {
        return question2;
    }
    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    public static void prepareGame() {
        int firstGame = 2;
        int secondGame = 3;
        int thirdGame = 4;
        int fourthGame = 5;
        int fifthGame = 6;
        if (App.getGameNumber() == firstGame) {
            question1 = Even.getQuestion1();
            Even.firstGame();
            question2 = Even.getQuestion2();
            correctAnswer = Even.getCorrectAnswer();
        } else if (App.getGameNumber() == secondGame) {
            question1 = Calc.getQuestion1();
            Calc.secondGame();
            question2 = Calc.getQuestion2();
            correctAnswer = Calc.getCorrectAnswer();
        } else if (App.getGameNumber() == thirdGame) {
            question1 = GCD.getQuestion1();
            GCD.thirdGame();
            question2 = GCD.getQuestion2();
            correctAnswer = GCD.getCorrectAnswer();
        } else if (App.getGameNumber() == fourthGame) {
            question1 = Progression.getQuestion1();
            Progression.fourthGame();
            question2 = Progression.getQuestion2();
            correctAnswer = Progression.getCorrectAnswer();
        } else if (App.getGameNumber() == fifthGame) {
            question1 = Prime.getQuestion1();
            Prime.fifthGame();
            question2 = Prime.getQuestion2();
            correctAnswer = Prime.getCorrectAnswer();
        }
    }

    public static void playGame() {
        System.out.println(question1);
        int count = 0;
        int trueCount = 3;
        do {
            System.out.print("Question: " + question2 + "\nYour answer: ");
            Scanner sc = new Scanner(System.in);
            String playerAnswer = sc.nextLine();

            if (correctAnswer.equals(playerAnswer)) {
                System.out.println("Correct!");
                count++;
                prepareGame();
            } else {
                System.out.println("'" + playerAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.\n" +
                        "Let's try again, " + Cli.getName() + "!");
                System.exit(0);
            }
        }
        while (count < trueCount);

        if (count == trueCount) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}

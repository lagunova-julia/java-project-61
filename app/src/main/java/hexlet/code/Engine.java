package hexlet.code;
import hexlet.code.games.*;
import java.util.Scanner;

public class Engine {
    static String question1;
    static String question2;
    static String correctAnswer;

    public static void prepareGame() {
        if (App.gameNumber == 2) {
            question1 = Even.question1;
            Even.firstGame();
            question2 = Even.question2;
            correctAnswer = Even.correctAnswer;
        } else if (App.gameNumber == 3) {
            question1 = Calc.question1;
            Calc.secondGame();
            question2 = Calc.question2;
            correctAnswer = Calc.correctAnswer;
        } else if (App.gameNumber == 4) {
            question1 = GCD.question1;
            GCD.thirdGame();
            question2 = GCD.question2;
            correctAnswer = GCD.correctAnswer;
        } else if (App.gameNumber == 5) {
            question1 = Progression.question1;
            Progression.fourthGame();
            question2 = Progression.question2;
            correctAnswer = Progression.correctAnswer;
        } else if (App.gameNumber == 6) {
            question1 = Prime.question1;
            Prime.fifthGame();
            question2 = Prime.question2;
            correctAnswer = Prime.correctAnswer;
        }
    }

    public static void playGame() {
        System.out.println(question1);
        int count = 0;
        do {
            System.out.print("Question: " + question2 + "\nYour answer: ");
            Scanner sc = new Scanner(System.in);
            String playerAnswer = sc.nextLine();

            if (correctAnswer.equals(playerAnswer)) {
                System.out.println("Correct!");
                count++;
                prepareGame();
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n" +
                        "Let's try again, " + Cli.name + "!");
                break;
            }
        }
        while (count < 3);

        if (count == 3) {
            System.out.println("Congratulations, " + Cli.name + "!");
        }
    }
}

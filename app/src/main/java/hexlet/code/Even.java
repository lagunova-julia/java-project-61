package hexlet.code;
import java.util.Scanner;

public class Even {
    public static void firstGame() {
        // пишется условие игры
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 0;
        do {
            //создается число и проверяется на четность
            int number = (int) (Math.random() * 100);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            //началась игра, вопрос:
            System.out.print("Question: " + number + "\nYour answer: ");

            // ввод ответа игрока
            Scanner sc = new Scanner(System.in);
            String playerAnswer = sc.nextLine();

            // проверяется ввод ответа игрока
            if (correctAnswer.equals(playerAnswer)) {
                System.out.println("Correct!");
                count++;
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

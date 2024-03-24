package hexlet.code.games;

public class Even {
    public static String question1 = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String question2;
    public static String correctAnswer;
    public static void firstGame() {
        // пишется условие игры
        int number = (int) (Math.random() * 100);
        question2 = String.valueOf(number);
        correctAnswer = ((number % 2) == 0) ? "yes" : "no";
    }
}

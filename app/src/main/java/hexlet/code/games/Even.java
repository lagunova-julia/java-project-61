package hexlet.code.games;

public class Even {
    private static String question1 = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String question2;
    private static String correctAnswer;
    public Even(String question1, String question2, String correctAnswer) {
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
    public static void firstGame() {
        // пишется условие игры
        int numbersCount = 100;
        int number = (int) (Math.random() * numbersCount);
        question2 = String.valueOf(number);
        correctAnswer = ((number % 2) == 0) ? "yes" : "no";
    }
}

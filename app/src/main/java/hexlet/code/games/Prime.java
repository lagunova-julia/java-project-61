package hexlet.code.games;

public class Prime {
    private static String question1 = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String question2;
    private static String correctAnswer;
    public Prime(String question1, String question2, String correctAnswer) {
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
    public static void fifthGame() {
        int number = (int) (Math.random() * 100);
        if (number == 0 || number == 1) {
            correctAnswer = "no";
        }
        for (int i = 2; i < (number / 2 + 1); i++) {
            if (number % i == 0) {
                correctAnswer = "no";
                break;
            } else {
                correctAnswer = "yes";
            }
        }
        // составляем выражение вопрос
        question2 = String.valueOf(number);
    }
}

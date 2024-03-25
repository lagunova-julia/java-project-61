package hexlet.code.games;

public class Calc {
    private static String question1 = "What is the result of the expression?";
    private static String question2;
    private static String correctAnswer;
    public Calc(String question1, String question2, String correctAnswer) {
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
    public static void secondGame() {
        char sign = 0;
        // создаются числа
        int numbersCount = 100;
        int number = (int) (Math.random() * numbersCount);
        int number2 = (int) (Math.random() * numbersCount);

        // выбор знака
        int signCount = 3;
        int signNumber = (int) (Math.random() * signCount);
        if (signNumber == 0) {
            sign = '+';
            correctAnswer = String.valueOf(number + number2);
        } else if (signNumber == 1) {
            sign = '-';
            correctAnswer = String.valueOf(number - number2);
        } else {
            sign = '*';
            correctAnswer = String.valueOf(number * number2);
        }
        // составляем выражение вопрос
        question2 = number + " " + sign + " " + number2;
    }
}

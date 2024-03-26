package hexlet.code.games;

public class Calc {
    private static String question1 = "What is the result of the expression?";
    private static String question2;
    private static String correctAnswer;
    public static final int numbersCount = 100;
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
    public static void setQuestion2(String question2) {
        Calc.question2 = question2;
    }
    public static void setCorrectAnswer(String correctAnswer) {
        Calc.correctAnswer = correctAnswer;
    }
    public static void secondGame() {
        char sign = 0;
        // создаются числа
        int number = (int) (Math.random() * numbersCount);
        int number2 = (int) (Math.random() * numbersCount);

        // выбор знака
        int signCount = 3;
        int signNumber = (int) (Math.random() * signCount);
        if (signNumber == 0) {
            sign = '+';
            String temp = String.valueOf(number + number2);
            setCorrectAnswer(temp);
        } else if (signNumber == 1) {
            sign = '-';
            String temp = String.valueOf(number - number2);
            setCorrectAnswer(temp);
        } else {
            sign = '*';
            String temp = String.valueOf(number * number2);
            setCorrectAnswer(temp);
        }
        // составляем выражение вопрос
        String temp = number + " " + sign + " " + number2;
        setQuestion2(temp);
    }
}

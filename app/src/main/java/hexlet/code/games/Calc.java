package hexlet.code.games;

public class Calc {
    public static final int NUMBERS_COUNT = 100;
    public static final int SIGNS_COUNT = 3;
    private static String roundQuestion;
    private static String roundAnswer;
    public static String getRoundQuestion() {
        return roundQuestion;
    }
    public static String getRoundAnswer() {
        return roundAnswer;
    }
    public static void generateRoundData() {
        char sign = 0;
        // создаются числа
        int number = (int) (Math.random() * NUMBERS_COUNT);
        int number2 = (int) (Math.random() * NUMBERS_COUNT);

        // выбор знака
        int signNumber = (int) (Math.random() * SIGNS_COUNT);
        if (signNumber == 0) {
            sign = '+';
            int temp = number + number2;
            roundAnswer = String.valueOf(temp);
        } else if (signNumber == 1) {
            sign = '-';
            int temp = number - number2;
            roundAnswer = String.valueOf(temp);
        } else {
            sign = '*';
            int temp = number * number2;
            roundAnswer = String.valueOf(temp);
        }
        // составляем выражение вопрос
        roundQuestion = number + " " + sign + " " + number2;
    }

    public static String mainQuestion() {
        return "What is the result of the expression?";
    }
}

package hexlet.code.games;

public class Calc {
    public static String question1 = "What is the result of the expression?";
    public static String question2;
    public static String correctAnswer;
    public static void secondGame() {
        char sign = 0;
        // создаются числа
        int number = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        // выбор знака
        int signNumber = (int) (Math.random() * 3);
        if (signNumber == 0) {
            sign = '+';
            correctAnswer = String.valueOf(number + number2);
        } else if(signNumber == 1) {
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

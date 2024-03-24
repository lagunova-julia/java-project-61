package hexlet.code.games;

public class GCD {
    public static String question1 = "Find the greatest common divisor of given numbers.";
    public static String question2;
    public static String correctAnswer;
    public static void thirdGame() {
        /* в этой игре создаются 2 числа
           составляется выражение-вопрос
           вычисляется наибольший общий делитель этих чисел
         */

        // создаются числа
        int number = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        // составляем выражение вопрос
        question2 = number + " " + number2;

        if (number == number2) {
            correctAnswer = String.valueOf(number);
        } else if (number == 0 || number2 == 0) {
            correctAnswer = String.valueOf(0);
        } else {
            int divindend = 0;
            int divisor = 0;
            int modulo = 0;
            if (number > number2) {
                divindend = number;
                divisor = number2;
            } else if (number < number2) {
                divindend = number2;
                divisor = number;
            }

            do {
                modulo = divindend % divisor;
                correctAnswer = String.valueOf(divisor);
                divindend = divisor;
                divisor = modulo;
            }
            while (modulo != 0);

        }
    }
}

package hexlet.code.games;

public class Prime {
    public static String question1 = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static String question2;
    public static String correctAnswer;
    public static void fifthGame() {
        /* в этой игре создается число
           проверяется на деление
         */
        // создается число
        int number = (int) (Math.random() * 100);
        if (number == 0 || number == 1) {
            correctAnswer = "no";
        }

        // проверяется на деление
        for (int i = 2; i < (number / 2 + 1); i++) {
            if (number % i == 0) {
                correctAnswer = "no";
                break;
            } else {
                correctAnswer = "yes";
            }
        }

        // составляем выражение вопрос, тоже составляется ЗДЕСЬ
        question2 = String.valueOf(number);
    }
}

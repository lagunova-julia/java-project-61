package hexlet.code.games;

public class GCD {
    private static String question1 = "Find the greatest common divisor of given numbers.";
    private static String question2;
    private static String correctAnswer;
    public GCD(String question1, String question2, String correctAnswer) {
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
    public static void thirdGame() {
        int numbersCount = 100;
        int number = (int) (Math.random() * numbersCount);
        int number2 = (int) (Math.random() * numbersCount);
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

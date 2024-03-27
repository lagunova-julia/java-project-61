package hexlet.code.games;

public class GCD {
    public static final int NUMBERS_COUNT = 100;
    private static String roundQuestion;
    private static String roundAnswer;
    public static String getRoundQuestion() {
        return roundQuestion;
    }
    public static String getRoundAnswer() {
        return roundAnswer;
    }

    public static void generateRoundData() {
        int number = (int) (Math.random() * NUMBERS_COUNT);
        int number2 = (int) (Math.random() * NUMBERS_COUNT);
        roundQuestion = number + " " + number2;
        //String answer = "";

        if (number == number2) {
            roundAnswer = String.valueOf(number);
        } else if (number == 0 || number2 == 0) {
            roundAnswer = String.valueOf(0);
        } else {
            int divindend = 0;
            int divisor = 0;
            int modulo = 0;
            if (number > number2) {
                divindend = number;
                divisor = number2;
            } else {
                divindend = number2;
                divisor = number;
            }
            do {
                modulo = divindend % divisor;
                roundAnswer = String.valueOf(divisor);
                divindend = divisor;
                divisor = modulo;
            }
            while (modulo != 0);
        }
        //return new String[]{question, answer};
    }

    public static String mainQuestion() {
        return "Find the greatest common divisor of given numbers.";
    }
}

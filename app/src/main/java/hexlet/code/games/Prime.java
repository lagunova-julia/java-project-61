package hexlet.code.games;

public class Prime {
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

        if (number == 0 || number == 1) {
            roundAnswer = "no";
        } else {
            for (int i = 2; i < (number / 2 + 1); i++) {
                if (number % i == 0) {
                    roundAnswer = "no";
                    break;
                } else {
                    roundAnswer = "yes";
                }
            }
        }
        roundQuestion = String.valueOf(number);
    }

    public static String mainQuestion() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}

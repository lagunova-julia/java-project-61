package hexlet.code.games;

public class Prime {
    public static final int NUMBERS_COUNT = 100;

    public static String[] generateRoundData() {
        int number = (int) (Math.random() * NUMBERS_COUNT);
        String answer = "";

        if (number == 0 || number == 1) {
            answer = "no";
        } else {
            for (int i = 2; i < (number / 2 + 1); i++) {
                if (number % i == 0) {
                    answer = "no";
                    break;
                } else {
                    answer = "yes";
                }
            }
        }
        String question = String.valueOf(number);
        return new String[]{question, answer};
    }

    public static String mainQuestion() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}

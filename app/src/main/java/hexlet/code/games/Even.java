package hexlet.code.games;

public class Even {
    public static final int NUMBERS_COUNT = 100;

    public static String[] generateRoundData() {
        int number = (int) (Math.random() * NUMBERS_COUNT);
        String answer = ((number % 2) == 0) ? "yes" : "no";
        String question = String.valueOf(number);
        return new String[]{question, answer};
    }

    public static String mainQuestion() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

}

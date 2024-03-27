package hexlet.code.games;

public class Even {
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
        roundAnswer = ((number % 2) == 0) ? "yes" : "no";
        roundQuestion = String.valueOf(number);
        //return new String[]{question, answer};
    }

    public static String mainQuestion() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

}

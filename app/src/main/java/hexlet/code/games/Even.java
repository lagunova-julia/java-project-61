package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    public static final int NUMBERS_COUNT = 100;
    public static final int ROUNDS_COUNT = 3;
    public static final int SAVE_DATA = 2;

    private static String[] generateRoundData() {
        int number = (int) (Math.random() * NUMBERS_COUNT);
        String answer = ((number % 2) == 0) ? "yes" : "no";
        String question = String.valueOf(number);
        return new String[]{question, answer};
    }

    public static void makeGame() {
        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[ROUNDS_COUNT][SAVE_DATA];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.playGame(question, roundsData);

    }
}

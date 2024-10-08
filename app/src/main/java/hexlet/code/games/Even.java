package hexlet.code.games;
import hexlet.code.Engine;

public class Even {
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String[] generateRoundData() {
        int number = (int) (Math.random() * Engine.NUMBERS_COUNT);
        String answer = ((number % 2) == 0) ? "yes" : "no";
        String question = String.valueOf(number);
        return new String[]{question, answer};
    }

    public static void makeGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][Engine.SAVE_DATA];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.playGame(QUESTION, roundsData);
    }
}

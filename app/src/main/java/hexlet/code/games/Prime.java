package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static String[] generateRoundData() {
        int number = (int) (Math.random() * Engine.NUMBERS_COUNT);
        String answer = isPrimeNumber(number) ? "yes" : "no";
        String question = String.valueOf(number);
        return new String[]{question, answer};
    }
    private static boolean isPrimeNumber(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        int sqrtNumber = (int) (Math.sqrt(number));
        for (int i = 2; i < (sqrtNumber + 1); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void makeGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][Engine.SAVE_DATA];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.playGame(QUESTION, roundsData);
    }
}

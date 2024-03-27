package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static final int NUMBERS_COUNT = 100;
    public static final int ROUNDS_COUNT = 3;
    public static final int SAVE_DATA = 2;

    private static String[] generateRoundData() {
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

    public static void makeGame() {
        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] roundsData = new String[ROUNDS_COUNT][SAVE_DATA];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.playGame(question, roundsData);

    }
}

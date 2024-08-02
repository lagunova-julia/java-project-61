package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static String[] generateRoundData() {
        int number = (int) (Math.random() * Engine.NUMBERS_COUNT);
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
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][Engine.SAVE_DATA];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.playGame(question, roundsData);
    }
}

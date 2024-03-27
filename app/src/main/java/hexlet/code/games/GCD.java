package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static final int NUMBERS_COUNT = 100;
    public static final int ROUNDS_COUNT = 3;
    public static final int SAVE_DATA = 2;

    private static String[] generateRoundData() {
        int number = (int) (Math.random() * NUMBERS_COUNT);
        int number2 = (int) (Math.random() * NUMBERS_COUNT);
        String question = number + " " + number2;
        String answer = "";

        if (number == number2) {
            answer = String.valueOf(number);
        } else if (number == 0 || number2 == 0) {
            answer = String.valueOf(0);
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
                answer = String.valueOf(divisor);
                divindend = divisor;
                divisor = modulo;
            }
            while (modulo != 0);
        }
        return new String[]{question, answer};
    }

    public static void makeGame() {
        String question = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[ROUNDS_COUNT][SAVE_DATA];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.playGame(question, roundsData);

    }
}

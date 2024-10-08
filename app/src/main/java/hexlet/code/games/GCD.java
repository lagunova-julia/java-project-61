package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";
    public static String[] generateRoundData() {
        Random r = new Random();
        int number = r.nextInt(Engine.NUMBERS_COUNT + 1);
        int number2 = r.nextInt(Engine.NUMBERS_COUNT + 1);
        String question = number + " " + number2;
        String answer = getAnswer(number, number2);
        return new String[]{question, answer};
    }

    private static String getAnswer(int number, int number2) {
        if (number == number2 || number2 == 0) {
            return String.valueOf(number);
        } else if (number == 0) {
            return String.valueOf(number2);
        } else {
            int result = findGCD(Math.max(number, number2), Math.min(number, number2));
            return String.valueOf(result);
        }
    }

    public static int findGCD(int number, int number2) {
        if (number2 == 0) {
            return number;
        } else {
            return findGCD(number2, number % number2);
        }
    }

    public static void makeGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][Engine.SAVE_DATA];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.playGame(QUESTION, roundsData);
    }
}

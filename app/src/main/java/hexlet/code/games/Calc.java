package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final String QUESTION = "What is the result of the expression?";
    private static String makeAnswer(int answer) {
        return String.valueOf(answer);
    }

    public static String[] generateRoundData() {
        Random r = new Random();
        int number = r.nextInt(Engine.NUMBERS_COUNT + 1);
        int number2 = r.nextInt(Engine.NUMBERS_COUNT + 1);
        char[] signs = {'+', '-', '*'};
        char sign = signs[r.nextInt(signs.length)];
        int result = calculateResult(number, number2, sign);

        String answer = makeAnswer(result);
        String question = number + " " + sign + " " + number2;
        return new String[]{question, answer};
    }

    private static int calculateResult(int number, int number2, char sign) {
        int result = 0;
        switch (sign) {
            case '+':
                result = number + number2;
                break;
            case '-':
                result = number - number2;
                break;
            case '*':
                result = number * number2;
                break;
            default:
                break;
        }
        return result;
    }

    public static void makeGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][Engine.SAVE_DATA];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.playGame(QUESTION, roundsData);
    }
}

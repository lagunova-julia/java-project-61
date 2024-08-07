package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static final int SIGNS_COUNT = 3;
    private static String makeAnswer(int answer) {
        return String.valueOf(answer);
    }

    public static String[] generateRoundData() {
        char sign = 0;
        Random r = new Random();
        int number = r.nextInt(Engine.NUMBERS_COUNT + 1);
        int number2 = r.nextInt(Engine.NUMBERS_COUNT + 1);

        int signNumber = r.nextInt(SIGNS_COUNT);
        int temp = 0;
        String answer = "";
        switch (signNumber) {
            case 0:
                sign = '+';
                temp = number + number2;
                answer = makeAnswer(temp);
                break;
            case 1:
                sign = '-';
                temp = number - number2;
                answer = makeAnswer(temp);
                break;
            case 2:
                sign = '*';
                temp = number * number2;
                answer = makeAnswer(temp);
                break;
            default:
                break;
        }
        String question = number + " " + sign + " " + number2;
        return new String[]{question, answer};
    }

    public static void makeGame() {
        String question = "What is the result of the expression?";
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][Engine.SAVE_DATA];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.playGame(question, roundsData);
    }
}

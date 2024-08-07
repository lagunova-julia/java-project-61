package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static String[] generateRoundData() {
        Random r = new Random();
        int number = r.nextInt(Engine.NUMBERS_COUNT + 1);
        int number2 = r.nextInt(Engine.NUMBERS_COUNT + 1);
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
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][Engine.SAVE_DATA];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.playGame(question, roundsData);

    }
}

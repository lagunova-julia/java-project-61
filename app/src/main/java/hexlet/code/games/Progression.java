package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;

public class Progression {
    private static final String QUESTION = "What number is missing in the progression?";
    public static final int PROGRAMME_STEP = 10;
    public static final int MIN_NUMBERS = 5;
    public static final int MAX_NUMBERS = 10;
    private static String makeAnswer(int answer) {
        return String.valueOf(answer);
    }

    public static String[] generateRoundData() {
        int a = (int) (Math.random() * Engine.NUMBERS_COUNT);
        int d = getRandomStep();
        int n = getRandomNumber();
        int answerPlace = (int) (Math.random() * n);

        int[] progression = generateProgression(a, d, n);
        String answer = makeAnswer(progression[answerPlace]);
        String question = generateQuestion(progression, answerPlace, n);

        return new String[]{question, answer};
    }

    private static int getRandomStep() {
        int d = 0;
        while (d == 0) {
            d = (int) (Math.random() * PROGRAMME_STEP);
        }
        return d;
    }

    private static int getRandomNumber() {
        return (int) (Math.random() * MAX_NUMBERS) + MIN_NUMBERS;
    }

    private static int[] generateProgression(int a, int d, int n) {
        int[] progression = new int[n];
        progression[0] = a;
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + d;
        }
        return progression;
    }

    private static String generateQuestion(int[] progression, int answerPlace, int n) {
        String[] newProgression = new String[n];
        for (int i = 0; i < newProgression.length; i++) {
            newProgression[i] = String.valueOf(progression[i]);
        }
        newProgression[answerPlace] = "..";

        String tempStr = Arrays.toString(newProgression)
                .replace('[', ' ')
                .replace(']', ' ')
                .replaceAll(",", "");
        return tempStr.trim();
    }

    public static void makeGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][Engine.SAVE_DATA];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.playGame(QUESTION, roundsData);
    }
}

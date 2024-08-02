package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    public static final int SIGNS_COUNT = 3;
    private static String makeAnswer(int answer) {
        // дописать ответ
        return String.valueOf(answer);
    }

    public static String[] generateRoundData() {
        char sign = 0;
        // создаются числа
        int number = (int) (Math.random() * Engine.NUMBERS_COUNT);
        int number2 = (int) (Math.random() * Engine.NUMBERS_COUNT);

        // выбор знака
        int signNumber = (int) (Math.random() * SIGNS_COUNT);
        String answer = "";
        if (signNumber == 0) {
            sign = '+';
            int temp = number + number2;
            answer = makeAnswer(temp);
        } else if (signNumber == 1) {
            sign = '-';
            int temp = number - number2;
            answer = makeAnswer(temp);
        } else {
            sign = '*';
            int temp = number * number2;
            answer = makeAnswer(temp);
        }
        // составляем выражение вопрос
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

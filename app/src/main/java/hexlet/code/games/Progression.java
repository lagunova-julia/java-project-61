package hexlet.code.games;
import java.util.Arrays;

public class Progression {
    public static final int NUMBERS_COUNT = 100;
    public static final int PROGRAMME_STEP = 10;
    public static final int MIN_NUMBERS = 5;
    public static final int MAX_NUMBERS = 10;

    private static String makeAnswer(int answer) {
        return String.valueOf(answer);
    }

    public static String[] generateRoundData() {
        // создаются числа: An+1 = An + d
        int a = (int) (Math.random() * NUMBERS_COUNT);
        int d = (int) (Math.random() * PROGRAMME_STEP);
        if (d == 0) {
            while (d == 0) {
                d = (int) (Math.random() * PROGRAMME_STEP);
            }
        }
        int n = (int) (Math.random() * MAX_NUMBERS) + MIN_NUMBERS;
        int answerPlace = (int) (Math.random() * n);
        // составление прогрессии
        int[] progression = new int[n];
        progression[0] = a;
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + d;
        }
        // сохраняем искомое значение в переменнную
        String answer = makeAnswer(progression[answerPlace]);
        // int[] to String[]
        String[] newProgression = new String[n];
        for (int i = 0; i < newProgression.length; i++) {
            newProgression[i] = String.valueOf(progression[i]);
        }
        // заполнение места пропуска ..
        newProgression[answerPlace] = "..";
        // составляем выражение вопрос
        var tempStr = Arrays.toString(newProgression).replace('[', ' ').replace(']', ' ').replaceAll(",", "");
        var question = tempStr.trim();

        return new String[]{question, answer};
    }

    public static String mainQuestion() {
        return "What number is missing in the progression?";
    }

}

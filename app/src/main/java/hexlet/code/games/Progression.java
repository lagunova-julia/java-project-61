package hexlet.code.games;

import java.util.Arrays;

public class Progression {
    public static String question1 = "What number is missing in the progression?";
    public static String question2;
    public static String correctAnswer;
    public static void fourthGame() {
        /* в этой игре создаются 2 числа - начало и шаг прогрессии
           выбирается рандомно длина прогресии
           выбирается рандомно место пропуска в прогресии (искомое в задаче)
           заполняется прогрессия
           заполняется в прогрессии место пропуска ..
           составляется выражение-вопрос
         */
        // создаются числа: An+1 = An + d
        int a = (int) (Math.random() * 100);
        int d = (int) (Math.random() * 10);
        if (d == 0) {
            while (d == 0) {
                d = (int) (Math.random() * 10);
            }
        }
        int n = (int) (Math.random() * 10) + 5;
        int answerPlace = (int) (Math.random() * 10);

        // составление прогрессии
        int[] progression = new int[n];
        progression[0] = a;
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + d;
        }

        // сохраняем искомое значение в переменнную
        correctAnswer = String.valueOf(progression[answerPlace]);

        // int[] to String[]
        String[] newProgression = new String[n];
        for (int i = 0; i < newProgression.length; i++) {
            newProgression[i] = String.valueOf(progression[i]);
        }

        // заполнение места пропуска ..
        newProgression[answerPlace] = "..";

        // составляем выражение вопрос
        question2 = Arrays.toString(newProgression);
    }
}

package hexlet.code.games;

import java.util.Arrays;

public class Progression {
    private static String question1 = "What number is missing in the progression?";
    private static String question2;
    private static String correctAnswer;
    public Progression(String question1, String question2, String correctAnswer) {
        Progression.question1 = question1;
        Progression.question2 = question2;
        Progression.correctAnswer = correctAnswer;
    }
    public static String getQuestion1() {
        return question1;
    }
    public static String getQuestion2() {
        return question2;
    }
    public static String getCorrectAnswer() {
        return correctAnswer;
    }
    public static void fourthGame() {
        // создаются числа: An+1 = An + d
        int a = (int) (Math.random() * 100);
        int d = (int) (Math.random() * 10);
        if (d == 0) {
            while (d == 0) {
                d = (int) (Math.random() * 10);
            }
        }
        int n = (int) (Math.random() * 10) + 5;
        int answerPlace = (int) (Math.random() * n);
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
        var tempStr = Arrays.toString(newProgression).replace('[', ' ').replace(']', ' ').replaceAll(",", "");
        question2 = tempStr.trim();
    }
}

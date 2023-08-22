package ru.job4j.condition;

public class ScoreMark {

    public static void printScoreMark(int score) {
        String mark = switch (score) {
            case 5 -> "perfect";
            case 4 -> "good";
            case 3 -> "passable";
            case 2, 1 -> "bad";
            default -> "wrong input score";
        };
        System.out.println(mark);
    }
}

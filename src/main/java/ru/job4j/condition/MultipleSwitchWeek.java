package ru.job4j.condition;

public class MultipleSwitchWeek {

    /**
     * Возвращает номер дня недели по названию.
     *
     * @param name Название дня (на русском или английском).
     * @return Номер дня от 1 (понедельник) до 7 (воскресенье), либо -1 если не найден.
     * @throws IllegalArgumentException если name == null
     */

    public static int numberOfDay(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Day name must not be null");
        }
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }
}
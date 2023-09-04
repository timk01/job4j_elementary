package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int prevMax = max(first, second);
        return prevMax > third ? prevMax : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        int prevMax = max(first, second, third);
        return prevMax > fourth ? prevMax : fourth;
    }
}
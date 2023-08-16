package ru.job4j;

public class Multiple {
    public static void main(String[] args) {
        int one = 1;
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d%n", one, i, one * i);
        }
    }
}

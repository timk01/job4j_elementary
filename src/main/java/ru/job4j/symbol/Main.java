package ru.job4j.symbol;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u0031\u0032\u0033");

        int a = 'A';
        int b = 'B';
        System.out.println("'A'");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("A + B: " + (a + b));

        char d = 'D';
        System.out.println(--d);
    }
}
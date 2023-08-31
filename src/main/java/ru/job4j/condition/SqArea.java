package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;
        return height * length;
    }

    public static void main(String[] args) {
        double square = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + square);
        double perimeter = 6;
        double coefficient = 2;
        square = square(perimeter, coefficient);
        System.out.printf("with perimeter = %.5f and coefficient = %.5f, rectangle square is = %.5f",
                perimeter, coefficient, square);
    }
}

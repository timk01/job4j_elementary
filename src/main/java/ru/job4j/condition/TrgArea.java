package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
        System.out.printf("area (%f, %f, %f) is %f", 4D, 5D, 7D, area(4, 5, 7));
    }
}

package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("result (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ") " + result);

        x1 = -2;
        y1 = 2;
        x2 = 4;
        y2 = 9;
        result = distance(x1, y1, x2, y2);
        System.out.printf("distance between points (%d, %d) and (%d, %d) is %.5f%n", x1, y1, x2, y2, result);

        x1 = 2;
        y1 = 0;
        x2 = -4;
        y2 = -3;
        System.out.printf("distance between points (%d, %d) and (%d, %d) is %.5f%n",
                x1, y1, x2, y2, distance(x1, y1, x2, y2));
    }
}

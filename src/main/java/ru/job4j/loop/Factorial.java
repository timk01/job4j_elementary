package ru.job4j.loop;

public class Factorial {
    /**
     * Calculates factorial of a non-negative integer.
     * @param n non-negative integer
     * @return factorial of n
     * @throws IllegalArgumentException if n is negative
     */

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for any negative number, you gave: " + n);
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

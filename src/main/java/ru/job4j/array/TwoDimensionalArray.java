package ru.job4j.array;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] twoDimensionalIntArray = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int i = 0; i < twoDimensionalIntArray.length; i++) {
            System.out.println(twoDimensionalIntArray[i].length);
        }
    }
}

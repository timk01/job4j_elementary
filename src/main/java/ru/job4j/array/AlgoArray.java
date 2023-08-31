package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] numbers = new int[] {5, 3, 2, 1, 4};
        int temp = numbers[0];
        numbers[0] = numbers[3];
        numbers[3] = temp;
        temp = numbers[1];
        numbers[1] = numbers[2];
        numbers[2] = temp;
        temp = numbers[3];
        numbers[3] = numbers[4];
        numbers[4] = temp;
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
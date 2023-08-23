package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbersArr = new int[5];
        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = i * 2 + 3;
        }
        for (int number : numbersArr) {
            System.out.println(number);
        }
    }
}

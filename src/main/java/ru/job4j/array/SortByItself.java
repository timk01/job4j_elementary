package ru.job4j.array;

import java.util.Arrays;

public class SortByItself {
    public static int[] sortByItself(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            int pos = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    pos = j;
                }
            }
            int temp = data[i];
            data[i] = min;
            data[pos] = temp;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] initialArray = {3, 5, 4, 2, 1};
        sortByItself(initialArray);
        Arrays.stream(initialArray).forEach(System.out::println);
    }
}

package ru.job4j.array;

public class SortSelectedOriginalAlgorithm {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            int minIndex = i;
            for (int j = 1 + i; j < data.length; j++) {
                if (min > data[j]) {
                    min = data[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = data[i];
                data[i] = min;
                data[minIndex] = temp;
            }
        }
        return data;
    }
}

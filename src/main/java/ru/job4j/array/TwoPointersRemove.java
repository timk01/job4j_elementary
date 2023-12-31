package ru.job4j.array;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */

public class TwoPointersRemove {

    public static int removeDuplicates(int[] arr) {
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 2};

        removeDuplicates(arr);
    }
}

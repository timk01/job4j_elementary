package ru.job4j.array;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * работает СТРОГО с отсортированным массивом: Arrays.sort(a); (и после - стандартный поиск дубликатов)
 * ЛИБО сунуть в сет (если порядок не важен сразу) и после set.stream().mapToInt(Integer::intValue).toArray()
 * ЛИБО LinkedHashSet (порядок вставки, н не сорт) или TreeSet (тут и порядок вставки, и сорт)
 * Если нужен массив без дублей:
 * int len = removeDuplicatesSorted(a);
 * int[] unique = java.util.Arrays.copyOf(a, len); // [1,2,3,4,5]
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

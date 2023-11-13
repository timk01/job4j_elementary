package ru.job4j.array;

/**
 * https://leetcode.com/articles/two-pointer-technique/
 */

public class ReverseStringArr {

    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[chars.length - i - 1]);
        }
        return stringBuilder.toString();
    }

    public static String twoPointersReverse(String str) {
        int i = 0;
        int j = str.length() - 1;
        char[] chars = str.toCharArray();
        while (i < j) {
            swap(chars, i, j);
            i++;
            j--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String reversed = reverse("Timur");
        System.out.println(reversed);
        System.out.println(twoPointersReverse("Timur"));
    }
}

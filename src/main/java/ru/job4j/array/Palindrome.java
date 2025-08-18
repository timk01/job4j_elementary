package ru.job4j.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * добавил классические варианты:
 * через стрингу, что-по-сути одно и то же с двумя укзателями
 * через лист (чит)
 * через стринбилдер (чит нумер 2)
 * это прям "не суперклассический палиндром" - т.к. Character.isLetterOrDigit Character.toLowerCase - лишнее
 * https://leetcode.com/problems/valid-palindrome/
 */

public class Palindrome {
    public static boolean isPalindromeTwoPointersWithAdditions(String s) {
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    public static boolean isPalindromeTwoPointers(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindromeClassic(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeCheaterApproach(List<Character> list) {
        List<Character> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return list.equals(reversed);
    }

    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String reversed = new StringBuilder(s).reverse().toString();
        boolean result = s.equals(reversed);
        return result;
    }
}

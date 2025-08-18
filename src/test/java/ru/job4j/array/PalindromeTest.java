package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static ru.job4j.array.Palindrome.isPalindromeTwoPointersWithAdditions;
import static ru.job4j.array.ReverseStringArr.reverse;

class PalindromeTest {

    @Test
    void whenEmptyStringIsPalindrome() {
        String in = "";
        boolean result = isPalindromeTwoPointersWithAdditions(in);
        assertThat(result).isTrue();
    }

    @Test
    void whenStringIsPalindrome() {
        String in = "A man, a plan, a canal: Panama";
        boolean result = isPalindromeTwoPointersWithAdditions(in);
        assertThat(result).isTrue();
    }

    @Test
    void whenStringIsNotPalindrome() {
        String in = "race a car";
        boolean result = isPalindromeTwoPointersWithAdditions(in);
        assertThat(result).isFalse();
    }
}
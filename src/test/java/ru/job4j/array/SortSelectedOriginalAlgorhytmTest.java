package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SortSelectedOriginalAlgorithmTest {

    @Test
    void sortSmallPositiveNumbersArray() {
        int[] initialArray = {9, 4, 5};
        int[] result = SortSelectedOriginalAlgorithm.sort(initialArray);
        int[] expected = {4, 5, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void sortBiggerPositiveNumbersArray() {
        int[] initialArray = {3, 5, 4, 2, 1};
        int[] result = SortSelectedOriginalAlgorithm.sort(initialArray);
        int[] expected = {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void sortBiggerNegativeNumbersArray() {
        int[] initialArray = {-3, -5, -44, -2, -11};
        int[] result = SortSelectedOriginalAlgorithm.sort(initialArray);
        int[] expected = {-44, -11, -5, -3, -2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void sortBiggerMixedNumbersArray() {
        int[] initialArray = {5, 3, 0, -2, -11};
        int[] result = SortSelectedOriginalAlgorithm.sort(initialArray);
        int[] expected = {-11, -2, 0, 3, 5};
        assertThat(result).containsExactly(expected);
    }
}
package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 3, 10};
        int elem = 5;
        int result = FindLoop.indexOf(data, elem);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinusOne() {
        int[] data = new int[] {2, -10, 30, 50, 40};
        int elem = 10;
        int result = FindLoop.indexOf(data, elem);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNotMinus10ThenMinusOne() {
        int[] data = new int[] {2, 10, 30, 50, 40, 1, -5, -9};
        int elem = -10;
        int result = FindLoop.indexOf(data, elem);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNotMinus10Then8() {
        int[] data = new int[] {2, 10, 30, 50, 40, 1, -5, -9, -10};
        int elem = -10;
        int result = FindLoop.indexOf(data, elem);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }
}
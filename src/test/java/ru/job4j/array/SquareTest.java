package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {

    @Test
    void whenBound3Then0And1And4() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenBound5Then0And1And4And9And16() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenBound4Then0And1And4And9() {
        int bound = 4;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {0, 1, 4, 9};
        assertThat(result).containsExactly(expected);
    }
}
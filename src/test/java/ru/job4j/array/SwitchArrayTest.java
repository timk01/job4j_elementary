package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

class SwitchArrayTest {

    @Test
    void swapBorderOkOnSmallArray() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = new int[]{4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void swapBorderOkOnBiggerArray() {
        int[] input = new int[] {1, 2, 3, 4, 20, 50, 100, 99, -10, -2, 3, 0, 90988, 110};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = new int[] {110, 2, 3, 4, 20, 50, 100, 99, -10, -2, 3, 0, 90988, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void swapCloseElementsOkOnSmallArray() {
        int[] input = new int[] {1, 2, 3, 4};
        int source = 1;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = new int[]{1, 3, 2, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void swapCloseElementsOkOnBiggerArray() {
        int[] input = new int[] {1, 2, 3, 4, 20, 50, 100, 99, -10, -2, 3, 0, 90988, 110};
        int source = 2;
        int dest = 6;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = new int[] {1, 2, 100, 4, 20, 50, 3, 99, -10, -2, 3, 0, 90988, 110};
        assertThat(result).containsExactly(expected);
    }
}
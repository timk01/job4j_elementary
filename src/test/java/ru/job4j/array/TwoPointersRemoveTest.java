package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TwoPointersRemoveTest {

    @Test
    void whenNoDuplicates() {
        int[] arr = {0, 1};
        int result = 2;
        int expected = TwoPointersRemove.removeDuplicates(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenOneDuplicate() {
        int[] arr = {0, 0, 1, 2};
        int result = 3;
        int expected = TwoPointersRemove.removeDuplicates(arr);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSeveralDuplicate() {
        int[] arr = {0, 0, 1, 1, 2};
        int result = 3;
        int expected = TwoPointersRemove.removeDuplicates(arr);
        assertThat(result).isEqualTo(expected);
    }
}
package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {
    @Test
    void turnArrayWithEvenAmountOfElementsThenArrayIsTurned() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenArrayIsTurned() {
        int[] input = new int[] {1, 5, 3, 10, 15, 2, 1};
        int[] result = Turn.back(input);
        int[] expected = new int[] {1, 2, 15, 10, 3, 5, 1};
        assertThat(result).containsExactly(expected);
    }
}
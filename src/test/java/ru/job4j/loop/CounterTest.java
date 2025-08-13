package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumFromOneToOneThenOne() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumFromZeroToTenThenFiftyFive() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumFromThreeToEightThenThirtyThree() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumFromMinusThreeToFifteenThenOneHundredFourteen() {
        int start = -3;
        int finish = 15;
        int result = Counter.sum(start, finish);
        int expected = 114;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumFromMinusTwelveToMinusOneThenMinusSeventyEight() {
        int start = -12;
        int finish = -1;
        int result = Counter.sum(start, finish);
        int expected = -78;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusEightToElevenThenTen() {
        int start = -8;
        int finish = 11;
        int result = Counter.sumByEven(start, finish);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusThreeToNineThenEighteen() {
        int start = -3;
        int finish = 9;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromZeroToNineThenEighteen() {
        int start = 0;
        int finish = 9;
        int result = Counter.sumByEven(start, finish);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }
}
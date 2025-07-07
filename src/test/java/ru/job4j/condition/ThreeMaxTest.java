package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeMaxTest {
    @Test
    void firstMax() {
        int first = 10;
        int second = 5;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void secondMax() {
        int first = 10;
        int second = 50;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void thirdMax() {
        int first = 1;
        int second = 5;
        int third = 100;
        int result = ThreeMax.max(first, second, third);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void allEq() {
        int first = 1;
        int second = 1;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void firstEqSecond() {
        int first = 10;
        int second = 10;
        int third = 1;
        int result = ThreeMax.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void firstEqThird() {
        int first = 100;
        int second = 1;
        int third = 100;
        int result = ThreeMax.max(first, second, third);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void secondEqThird() {
        int first = 1;
        int second = 100;
        int third = 100;
        int result = ThreeMax.max(first, second, third);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("threeMaxData")
    void checkMaxedNumber(int first, int second, int third, int max) {
        assertThat(ThreeMax.max(first, second, third)).isEqualTo(max);
    }

    static Stream<Arguments> threeMaxData() {
        return Stream.of(
                Arguments.of(10, 5, 1, 10),
                Arguments.of(10, 50, 1, 50),
                Arguments.of(1, 5, 100, 100),
                Arguments.of(1, 1, 1, 1),
                Arguments.of(10, 10, 1, 10),
                Arguments.of(100, 1, 100, 100),
                Arguments.of(1, 100, 100, 100)
        );
    }
}
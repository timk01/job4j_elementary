package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then2() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("twoNumbersData")
    void whenTwoNumbersThenMaxReturned(int first, int second, int result) {
        assertThat(Max.max(first, second)).isEqualTo(result);
    }

    static Stream<Arguments> twoNumbersData() {
        return Stream.of(
                Arguments.of(3, 2, 3),
                Arguments.of(2, 1, 2),
                Arguments.of(3, 3, 3)
        );
    }

    @Test
    void whenFirst1Second2Third3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst3Second2Third1Then3() {
        int first = 3;
        int second = 2;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("threeNumbersData")
    void whenThreeNumbersThenMaxReturned(int first, int second, int third, int result) {
        assertThat(Max.max(first, second, third)).isEqualTo(result);
    }

    @ParameterizedTest
    @MethodSource("threeNumbersData")
    void whenThreeNumbersThenMaxReturnedAlternativeMethod(int first, int second, int third, int result) {
        assertThat(Max.maxThreeAlternative(first, second, third)).isEqualTo(result);
    }

    static Stream<Arguments> threeNumbersData() {
        return Stream.of(
                Arguments.of(1, 2, 3, 3),
                Arguments.of(3, 2, 1, 3),
                Arguments.of(3, 3, 3, 3),
                Arguments.of(-3, -3, 0, 0)
        );
    }

    @Test
    void whenFirst1Second2Third3Fourth4Then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirstMinus1SecondMinus2ThirdMinus3FourthMinus4ThenMinus1() {
        int first = -1;
        int second = -2;
        int third = -3;
        int fourth = -4;
        int result = Max.max(first, second, third, fourth);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("fourNumbersData")
    void whenFourNumbersThenMaxReturned(int first, int second, int third, int fourth, int result) {
        assertThat(Max.max(first, second, third, fourth)).isEqualTo(result);
    }

    static Stream<Arguments> fourNumbersData() {
        return Stream.of(
                Arguments.of(-1, -2, -3, -4, -1),
                Arguments.of(1, 2, 3, 4, 4)
        );
    }
}
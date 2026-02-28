package ru.job4j.loop;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CheckPrimeNumberTest {
    @Test
    void when5() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    void when199() {
        int number = 199;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @MethodSource("advancedCheckTestData")
    void whenCheckPrimeThenReturnExpected(int number, boolean expectedPrime) {
        assertThat(CheckPrimeNumber.advancedCheck(number)).isEqualTo(expectedPrime);
    }

    private static Stream<Arguments> advancedCheckTestData() {
        return Stream.of(
                Arguments.of(-1, false),
                Arguments.of(0, false),
                Arguments.of(1, false),

                Arguments.of(2, true),
                Arguments.of(3, true),
                Arguments.of(5, true),
                Arguments.of(7, true),
                Arguments.of(11, true),
                Arguments.of(13, true),

                Arguments.of(4, false),
                Arguments.of(9, false),
                Arguments.of(25, false)
        );
    }
}
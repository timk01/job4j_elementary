package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class SqAreaTest {
    private static final double DEFAULT_PRECISION = 0.0001;

    @Test
    void whenP6K2ThenSquare2() {
        double expected = 2;
        double perimeter = 6;
        double coefficient = 2;
        double out = SqArea.square(perimeter, coefficient);
        assertThat(out).isEqualTo(expected, withPrecision(DEFAULT_PRECISION));
    }

    @Test
    void whenP0Dot5K0Dot5ThenSquare0Dot0138() {
        double expected = 0.0138;
        double perimeter = 0.5;
        double coefficient = 0.5;
        double out = SqArea.square(perimeter, coefficient);
        assertThat(out).isEqualTo(expected, withPrecision(DEFAULT_PRECISION));
    }

    @Test
    void whenP4K1ThenSquare1() {
        double expected = 1;
        double perimeter = 4;
        double coefficient = 1;
        double out = SqArea.square(perimeter, coefficient);
        assertThat(out).isEqualTo(expected, withPrecision(DEFAULT_PRECISION));
    }

    @ParameterizedTest
    @MethodSource("triangleData")
    void whenDataIsProvidedThenResultIsDecent(double perimeter, double coefficient, double expected) {
        assertThat(SqArea.square(perimeter, coefficient)).isEqualTo(expected, withPrecision(DEFAULT_PRECISION));
    }

    static Stream<Arguments> triangleData() {
        return Stream.of(
                Arguments.of(6, 2, 2),
                Arguments.of(0.5, 0.5, 0.0138),
                Arguments.of(4, 1, 1)
        );
    }
}
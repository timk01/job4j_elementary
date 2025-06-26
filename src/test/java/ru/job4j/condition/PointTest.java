package ru.job4j.condition;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    private static final double DEFAULT_PRECISION = 0.0001;

    @Test
    void whenFirstIs0And0WhileSecondIs2And0Then2dot0() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        double expected = 2.0;
        assertThat(out).isEqualTo(expected, withPrecision(DEFAULT_PRECISION));
    }

    @Test
    void whenFirstIsMinus2And2WhileSecondIs4And9Then9dot2195() {
        Point point1 = new Point(-2, 2);
        Point point2 = new Point(4, 9);
        double out = point1.distance(point2);
        double expected = 9.2195;
        assertThat(out).isEqualTo(expected, withPrecision(DEFAULT_PRECISION));
    }

    @Test
    void whenFirstIs2And0WhileSecondIsMinus4And3Then6dot7082() {
        Point point1 = new Point(2, 0);
        Point point2 = new Point(-4, 3);
        double out = point1.distance(point2);
        double expected = 6.7082;
        assertThat(out).isEqualTo(expected, withPrecision(DEFAULT_PRECISION));
    }

    @ParameterizedTest
    @MethodSource("pointData")
    void whenPointDataIsProvidedThenCalculatedDistanceIsCorrect(Point a, Point b, double expected) {
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(DEFAULT_PRECISION));
    }

    static Stream<Arguments> pointData() {
        return Stream.of(
                Arguments.of(new Point(0, 0), new Point(2, 0), 2.0),
                Arguments.of(new Point(-2, 2), new Point(4, 9), 9.2195),
                Arguments.of(new Point(2, 0), new Point(-4, 3), 6.7082)
        );
    }
}
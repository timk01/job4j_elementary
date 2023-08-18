package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2ThenSquare2() {
        double expected = 2;
        double perimeter = 6;
        double coefficient = 2;
        double out = SqArea.square(perimeter, coefficient);
        double precision = 0.0001;
        assertThat(out).isEqualTo(expected, withPrecision(precision));
    }

    @Test
    void whenP0Dot5K0Dot5ThenSquare0Dot0138() {
        double expected = 0.0138;
        double perimeter = 0.5;
        double coefficient = 0.5;
        double out = SqArea.square(perimeter, coefficient);
        double precision = 0.0001;
        assertThat(out).isEqualTo(expected, withPrecision(precision));
    }

    @Test
    void whenP4K1ThenSquare1() {
        double expected = 1;
        double perimeter = 4;
        double coefficient = 1;
        double out = SqArea.square(perimeter, coefficient);
        double precision = 0.0001;
        assertThat(out).isEqualTo(expected, withPrecision(precision));
    }
}
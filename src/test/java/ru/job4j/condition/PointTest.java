package ru.job4j.condition;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenFirstIs0And0WhileSecondIs2And0Then2dot0() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        double expected = 2.0;
        double precision = 0.0001;
        assertThat(out).isEqualTo(expected, withPrecision(precision));
    }

    @Test
    void whenFirstIsMinus2And2WhileSecondIs4And9Then9dot2195() {
        Point point1 = new Point(-2, 2);
        Point point2 = new Point(4, 9);
        double out = point1.distance(point2);
        double expected = 9.2195;
        double precision = 0.0001;
        assertThat(out).isEqualTo(expected, withPrecision(precision));
    }

    @Test
    void whenFirstIs2And0WhileSecondIsMinus4And3Then6dot7082() {
        Point point1 = new Point(2, 0);
        Point point2 = new Point(-4, 3);
        double out = point1.distance(point2);
        double expected = 6.7082;
        double precision = 0.0001;
        assertThat(out).isEqualTo(expected, withPrecision(precision));
    }
}
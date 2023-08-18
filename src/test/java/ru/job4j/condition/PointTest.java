package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when0And0To0And0Then2dot0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 2.0;
        double precision = 0.0001;
        assertThat(out).isEqualTo(expected, withPrecision(precision));
    }

    @Test
    void whenMin2And2To4And9Then9dot2195() {
        int x1 = -2;
        int y1 = 2;
        int x2 = 4;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 9.2195;
        double precision = 0.0001;
        assertThat(out).isEqualTo(expected, withPrecision(precision));
    }

    @Test
    void when2And0ToMin4AndMin9Then6dot7082() {
        int x1 = 2;
        int y1 = 0;
        int x2 = -4;
        int y2 = -3;
        double out = Point.distance(x1, y1, x2, y2);
        double expected = 6.7082;
        double precision = 0.0001;
        assertThat(out).isEqualTo(expected, withPrecision(precision));
    }
}
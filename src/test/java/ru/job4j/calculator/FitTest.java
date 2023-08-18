package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenManHeight187ThenWeight100dot05() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        double precision = 0.0001;
        assertThat(out).isEqualTo(expected, withPrecision(precision));
    }

    @Test
    void whenWomanHeight160ThenWeight57dot49999() {
        short in = 160;
        double expected = 57.499999;
        double out = Fit.womanWeight(in);
        double precision = 0.0001;
        assertThat(out).isEqualTo(expected, withPrecision(precision));
    }
}
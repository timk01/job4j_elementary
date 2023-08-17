package ru.job4j.converter;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void convertRubleToEuroSuccess() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.000_0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void convertRubleToEuroFail() {
        float in = 140;
        float expected = 2.2F;
        float out = Converter.rubleToEuro(in);
        float eps = 0.000_0001f;
        assertThat(out).isNotCloseTo(expected, withPrecision(eps));
    }

    @Test
    void convertRubleToDollarSuccess() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.000_0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void convertRubleOfValue0ToDollarSuccess() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToDollar(in);
        float eps = 0.000_0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void convertRubleToDollarFail() {
        float in = 180;
        float expected = 3.5F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.000_0001f;
        assertThat(out).isNotCloseTo(expected, withPrecision(eps));
    }

    @Test
    void convertRubleOfValue0ToEuroSuccess() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToDollar(in);
        float eps = 0.000_0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}
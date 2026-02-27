package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.job4j.condition.Triangle;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RoublesThen2Euros() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert180RoublesThen3Dollars() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert0RoublesThen0Euros() {
        float in = 0;
        float expected = 0;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert180RoublesThen3dot5Dollars() {
        float in = 180;
        float expected = 3.5F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isNotCloseTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert160RoublesThen2dot29Euros() {
        double in = 160;
        double expected = 2.29;
        double out = Converter.roundedTill2DigitsRubleToEuro(in);
        double eps = 0.01f;
        assertThat(out).isCloseTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert160RoublesThen2dot29EurosUsingAlternativeImplementation() {
        double in = 160;
        double expected = 2.29;
        double out = Converter.preciseRubleToEuro(in);
        double eps = 0.01f;
        assertThat(out).isCloseTo(expected, withPrecision(eps));
    }

    static Stream<Arguments> roubleData() {
        return Stream.of(
                Arguments.of(160),
                Arguments.of(170)
        );
    }

    @ParameterizedTest
    @MethodSource("roubleData")
    void whenMethodsAreEquivalent(double firstVal) {
        double result1 = Converter.roundedTill2DigitsRubleToEuro(firstVal);
        double result2 = Converter.preciseRubleToEuro(firstVal);
        double eps = 0.0001;
        assertThat(result1).isCloseTo(result2, withPrecision(eps));
    }
}
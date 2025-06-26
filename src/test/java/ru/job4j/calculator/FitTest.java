package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class FitTest {

    private static final double DEFAULT_PRECISION = 0.0001;
    @Test
    public void whenManHeight187ThenWeight10035() {
        short height = 187;
        double expected = 100.05;
        double result = Fit.manWeight(height);
        assertEquals(expected, result, DEFAULT_PRECISION);
    }

    @Test
    public void whenWomanHeight160ThenWeight57And5() {
        short height = 160;
        double expected = 57.5;
        double result = Fit.womanWeight(height);
        assertEquals(expected, result, DEFAULT_PRECISION);
    }

    @Test
    public void whenManHeight170ThenWeight80And5() {
        short height = 170;
        double expected = 80.5;
        double result = Fit.manWeight(height);
        assertEquals(expected, result, DEFAULT_PRECISION);
    }

    @Test
    public void whenWomanHeight150ThenWeight46() {
        short height = 150;
        double expected = 46.0;
        double result = Fit.womanWeight(height);
        assertEquals(expected, result, DEFAULT_PRECISION);
    }

    @ParameterizedTest
    @MethodSource("manHeightData")
    void whenManHeightIsProvidedThenWeightIsCorrect(short height, double expected) {
        assertThat(Fit.manWeight(height)).isEqualTo(expected, withPrecision(DEFAULT_PRECISION));
    }

    static Stream<Arguments> manHeightData() {
        return Stream.of(
                Arguments.of((short) 187, 100.05),
                Arguments.of((short) 170, 80.5)
        );
    }

    @ParameterizedTest
    @MethodSource("womanHeightData")
    void whenWomanHeightIsProvidedThenWeightIsCorrect(short height, double expected) {
        assertThat(Fit.womanWeight(height)).isEqualTo(expected, withPrecision(DEFAULT_PRECISION));
    }

    static Stream<Arguments> womanHeightData() {
        return Stream.of(
                Arguments.of((short) 160, 57.5),
                Arguments.of((short) 150, 46.0)
        );
    }
}

package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MortgageTest {
    @Test
    void whenAmount1000Salary1200Percent1ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAmount100Salary120Percent50ThenYear2() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAmount1000Salary1200Percent20ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 20;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("mortrageTestData")
    void whenVariousInputsThenCorrectYears(double amount, int salary, double percent, int expectedYears) {
        assertThat(Mortgage.year(amount, salary, percent)).isEqualTo(expectedYears);
    }

    private static Stream<Arguments> mortrageTestData() {
        return Stream.of(
                Arguments.of(1000, 1200, 1.0, 1),
                Arguments.of(100, 120, 50.0, 2),
                Arguments.of(1000, 1200, 20.0, 1),
                Arguments.of(100000, 5000, 10.0, -1)
        );
    }
}
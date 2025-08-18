package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LogicNotTest {
    @Test
    void whenIsEvenTrue() {
        int num = 2;
        boolean result = LogicNot.isEven(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenIsEvenFalse() {
        int num = 3;
        boolean result = LogicNot.isEven(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenIsPositiveTrue() {
        int num = 2;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenIsPositiveFalse() {
        int num = -2;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNumIs0IsPositiveFalse() {
        int num = 0;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenFalse() {
        int num = 2;
        boolean result = LogicNot.notEven(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenTrue() {
        int num = 3;
        boolean result = LogicNot.notEven(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNegativeTrue() {
        int num = -2;
        boolean result = LogicNot.isNegative(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNegativeFalse() {
        int num = 2;
        boolean result = LogicNot.isNegative(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNumIs0NegativeFalse() {
        int num = 0;
        boolean result = LogicNot.isNegative(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenAndPositiveIsTrue() {
        int num = 3;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEvenFalseIsAllFalse() {
        int num = 2;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenPositiveFalseIsAllFalse() {
        int num = -3;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenAndPositiveIsFalse() {
        int num = 0;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenEvenOrNegativeIsTrue() {
        int num = -2;
        boolean result = LogicNot.evenOrNegative(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenEvenIsTrueThenAllIsTrue() {
        int num = 2;
        boolean result = LogicNot.evenOrNegative(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNegativeIsTrueThenAllIsTrue() {
        int num = -3;
        boolean result = LogicNot.evenOrNegative(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenEvenOrNegativeIsFalse() {
        int num = 3;
        boolean result = LogicNot.evenOrNegative(num);
        assertThat(result).isFalse();
    }

    private static Stream<Arguments> isEvenData() {
        return Stream.of(
                Arguments.of(2, true),
                Arguments.of(3, false),
                Arguments.of(0, true),
                Arguments.of(-4, true),
                Arguments.of(-3, false)
        );
    }

    @ParameterizedTest
    @MethodSource("isEvenData")
    void testIsEven(int input, boolean expected) {
        assertThat(LogicNot.isEven(input)).isEqualTo(expected);
    }

    private static Stream<Arguments> isPositiveData() {
        return Stream.of(
                Arguments.of(2, true),
                Arguments.of(-2, false),
                Arguments.of(0, false)
        );
    }

    @ParameterizedTest
    @MethodSource("isPositiveData")
    void testIsPositive(int input, boolean expected) {
        assertThat(LogicNot.isPositive(input)).isEqualTo(expected);
    }

    private static Stream<Arguments> isNegativeData() {
        return Stream.of(
                Arguments.of(-2, true),
                Arguments.of(2, false),
                Arguments.of(0, false)
        );
    }

    @ParameterizedTest
    @MethodSource("isNegativeData")
    void testIsNegative(int input, boolean expected) {
        assertThat(LogicNot.isNegative(input)).isEqualTo(expected);
    }

    private static Stream<Arguments> notEvenAndPositiveData() {
        return Stream.of(
                Arguments.of(3, true),
                Arguments.of(2, false),
                Arguments.of(-3, false),
                Arguments.of(0, false)
        );
    }

    @ParameterizedTest
    @MethodSource("notEvenAndPositiveData")
    void testNotEvenAndPositive(int input, boolean expected) {
        assertThat(LogicNot.notEvenAndPositive(input)).isEqualTo(expected);
    }

    private static Stream<Arguments> evenOrNegativeData() {
        return Stream.of(
                Arguments.of(-2, true),
                Arguments.of(2, true),
                Arguments.of(-3, true),
                Arguments.of(3, false)
        );
    }

    @ParameterizedTest
    @MethodSource("evenOrNegativeData")
    void testEvenOrNegative(int input, boolean expected) {
        assertThat(LogicNot.evenOrNegative(input)).isEqualTo(expected);
    }
}
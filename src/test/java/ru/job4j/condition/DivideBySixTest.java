package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class DivideBySixTest {

    @ParameterizedTest
    @MethodSource("checkNumber")
    void checkGuessedNumber(int number, String result) {
        assertThat(DivideBySix.checkNumber(number)).isEqualTo(result);
    }

    static Stream<Arguments> checkNumber() {
        return Stream.of(
                Arguments.of(24, "The number divides by 6."),
                Arguments.of(9, "The number divides by 3, but it isn't the even number."),
                Arguments.of(14, "The number doesn't divide by 3, but it is the even number."),
                Arguments.of(25, "The number doesn't divide by 3 and it isn't the even number.")
        );
    }
}
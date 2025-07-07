package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class MultipleSwitchWeekTest {

    @Test
    void whenDayIsNullThenThrowException() {
        assertThatThrownBy(() -> MultipleSwitchWeek.numberOfDay(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @MethodSource("checkDayData")
    void checkGuessedDayNumberByName(String name, int dayNumber) {
        assertThat(MultipleSwitchWeek.numberOfDay(name)).isEqualTo(dayNumber);
    }

    static Stream<Arguments> checkDayData() {
        return Stream.of(
                Arguments.of("Понедельник", 1),
                Arguments.of("Monday", 1),
                Arguments.of("Вторник", 2),
                Arguments.of("Tuesday", 2),
                Arguments.of("Среда", 3),
                Arguments.of("Wednesday", 3),
                Arguments.of("Четверг", 4),
                Arguments.of("Thursday", 4),
                Arguments.of("Пятница", 5),
                Arguments.of("Friday", 5),
                Arguments.of("Суббота", 6),
                Arguments.of("Saturday", 6),
                Arguments.of("Воскресенье", 7),
                Arguments.of("Sunday", 7),
                Arguments.of("Notaday", -1),
                Arguments.of("", -1)
        );
    }

}
package ru.job4j.condition;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class SwitchWeekTest {

    @ParameterizedTest
    @MethodSource("checkDayData")
    void checkGuessedDayNumber(int number, String day) {
        assertThat(SwitchWeek.nameOfDay(number)).isEqualTo(day);
    }

    static Stream<Arguments> checkDayData() {
        return Stream.of(
                Arguments.of(1, "Понедельник"),
                Arguments.of(2, "Вторник"),
                Arguments.of(3, "Среда"),
                Arguments.of(4, "Четверг"),
                Arguments.of(5, "Пятница"),
                Arguments.of(6, "Суббота"),
                Arguments.of(7, "Воскресенье"),
                Arguments.of(0, "Ошибка"),
                Arguments.of(8, "Ошибка"),
                Arguments.of(-1, "Ошибка")
        );
    }

}
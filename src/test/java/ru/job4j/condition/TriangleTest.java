package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotExist() {
        double ab = 5.0;
        double ac = 1.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    static Stream<Arguments> triangleExistsData() {
        return Stream.of(
                Arguments.of(3, 4, 5),
                Arguments.of(7, 10, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("triangleExistsData")
    void whenTriangleExistsThenTrue(double ab, double ac, double bc) {
        assertThat(Triangle.exist(ab, ac, bc)).isTrue();
    }

    static Stream<Arguments> triangleDoesNotExistsData() {
        return Stream.of(
                Arguments.of(10, 2, 7),
                Arguments.of(1, 2, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("triangleDoesNotExistsData")
    void whenTriangleDoesNotExistThenFalse(double ab, double ac, double bc) {
        assertThat(Triangle.exist(ab, ac, bc)).isFalse();
    }
}
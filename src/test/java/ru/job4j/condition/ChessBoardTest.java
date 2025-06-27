package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ChessBoardTest {
    @Test
    void rookWayIs6() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 6;
        int result = ChessBoard.rookWay(x1, y1, x2, y2);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void rookWayIs5() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 0;
        int result = ChessBoard.rookWay(x1, y1, x2, y2);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void rookWayIs0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 6;
        int result = ChessBoard.rookWay(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> rookWayData() {
        return Stream.of(
                Arguments.of(0, 0, 0, 6, 6),
                Arguments.of(0, 0, 5, 0, 5),
                Arguments.of(0, 0, 5, 6, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("rookWayData")
    void whenRookMovesThenReturnDistance(int x1, int y1, int x2, int y2, int expected) {
        assertThat(ChessBoard.rookWay(x1, y1, x2, y2)).isEqualTo(expected);
    }

    @Test
    void elephantWayIs5() {
        int x1 = 6;
        int y1 = 7;
        int x2 = 1;
        int y2 = 2;
        int result = ChessBoard.elephantWay(x1, y1, x2, y2);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void elephantWayIs7() {
        int x1 = 7;
        int y1 = 0;
        int x2 = 0;
        int y2 = 7;
        int result = ChessBoard.elephantWay(x1, y1, x2, y2);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void elephantWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.elephantWay(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenX1isMinus1ThenElephantWayIs0() {
        int x1 = -1;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.elephantWay(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenY1isMinus1ThenElephantWayIs0() {
        int x1 = 2;
        int y1 = -1;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.elephantWay(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenX2isMinus1ThenElephantWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = -1;
        int y2 = 1;
        int result = ChessBoard.elephantWay(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenY2isMinus1ThenElephantWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = -1;
        int result = ChessBoard.elephantWay(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenX1isGreater7ThenElephantWayIs0() {
        int x1 = 10;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.elephantWay(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenY1isGreater7ThenElephantWayIs0() {
        int x1 = 2;
        int y1 = 10;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.elephantWay(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenX2isGreater7ThenElephantWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 10;
        int y2 = 1;
        int result = ChessBoard.elephantWay(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenY2isGreater7ThenElephantWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 10;
        int result = ChessBoard.elephantWay(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> elephantWayData() {
        return Stream.of(
                Arguments.of(6, 7, 1, 2, 5),
                Arguments.of(7, 0, 0, 7, 7),
                Arguments.of(2, 6, 4, 1, 0),
                Arguments.of(-1, 6, 4, 1, 0),
                Arguments.of(2, -1, 4, 1, 0),
                Arguments.of(2, 6, -1, 1, 0),
                Arguments.of(2, 6, 4, -1, 0),
                Arguments.of(10, 6, 4, 1, 0),
                Arguments.of(2, 10, 4, 1, 0),
                Arguments.of(2, 6, 10, 1, 0),
                Arguments.of(2, 6, 4, 10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("elephantWayData")
    void whenElephantMovesThenReturnDistance(int x1, int y1, int x2, int y2, int expected) {
        assertThat(ChessBoard.elephantWay(x1, y1, x2, y2)).isEqualTo(expected);
    }
}
package ru.job4j.condition;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class ScoreMarkTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void whenScore5() {
        ScoreMark.printScoreMark(5);
        assertThat("perfect").isEqualTo(outputStreamCaptor.toString()
                .trim());
    }

    @Test
    void whenScore3() {
        ScoreMark.printScoreMark(3);
        assertThat("passable").isEqualTo(outputStreamCaptor.toString()
                .trim());
    }

    @Test
    void whenScoreNothing() {
        ScoreMark.printScoreMark(9);
        assertThat("wrong input score").isEqualTo(outputStreamCaptor.toString()
                .trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
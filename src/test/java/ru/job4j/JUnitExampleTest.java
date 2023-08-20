package ru.job4j;

import org.junit.jupiter.api.*;
import org.junit.platform.commons.util.StringUtils;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.*;

class JUnitExampleTest {

    @Test
    void when5And5Then25() {
        JUnitExample jUnitExample = new JUnitExample();
        int result = jUnitExample.multiply(5, 5);
        int expected = 25;
        assertThat(result).isEqualTo(expected);
    }

    @RepeatedTest(2)
    void when6And6Then36() {
        JUnitExample jUnitExample = new JUnitExample();
        int result = jUnitExample.multiply(6, 6);
        int expected = 36;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("When 7 multi 7 should be 49")
    void when7And7Then49() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(7, 7);
        assertThat(result).isEqualTo(49);
    }

    @Disabled("smh is wrong with method")
    @Test
    void when10And10Then25() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(10, 10);
        assertThat(result).isEqualTo(100);
    }

    @Timeout(value = 6000, unit = TimeUnit.MILLISECONDS)
    @Test
    void when15And15hen225() throws InterruptedException {
        Thread.sleep(5000);
        JUnitExample example = new JUnitExample();
        int result = example.multiply(15, 15);
        assertThat(result).isEqualTo(225);
    }
}
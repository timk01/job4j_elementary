package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static ru.job4j.array.ReverseStringArr.reverse;
import static ru.job4j.array.ReverseStringArr.twoPointersReverse;

class ReverseStringArrTest {

    @Test
    void whenNothingToReverse() {
        String in = "";
        String result = reverse(in);
        String expected = "";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwoPointersNothingToReverse() {
        String in = "";
        String result = twoPointersReverse(in);
        String expected = "";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirstReverse() {
        String in = "timbuktu12";
        String result = reverse(in);
        String expected = "21utkubmit";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwoPointersFirstReverse() {
        String in = "timbuktu12";
        String result = twoPointersReverse(in);
        String expected = "21utkubmit";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSecondReverse() {
        String in = "njnschnjkdasn j32 uida";
        String result = reverse(in);
        String expected = "adiu 23j nsadkjnhcsnjn";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwoPointersSecondReverse() {
        String in = "njnschnjkdasn j32 uida";
        String result = twoPointersReverse(in);
        String expected = "adiu 23j nsadkjnhcsnjn";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenThirdReverse() {
        String in = "Timur ";
        String result = reverse(in);
        String expected = " rumiT";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwoPointersThirdReverse() {
        String in = "Somt1";
        String result = twoPointersReverse(in);
        String expected = "1tmoS";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenForthReverse() {
        String in = "reverseastring";
        String result = reverse(in);
        String expected = "gnirtsaesrever";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwoPointersForthReverse() {
        String in = "reverseastring";
        String result = twoPointersReverse(in);
        String expected = "gnirtsaesrever";
        assertThat(result).isEqualTo(expected);
    }
}
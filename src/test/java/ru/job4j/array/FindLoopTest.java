package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 3, 10};
        int elem = 5;
        int result = FindLoop.indexOf(data, elem);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinusOne() {
        int[] data = new int[] {2, -10, 30, 50, 40};
        int elem = 10;
        int result = FindLoop.indexOf(data, elem);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNotMinus10ThenMinusOne() {
        int[] data = new int[] {2, 10, 30, 50, 40, 1, -5, -9};
        int elem = -10;
        int result = FindLoop.indexOf(data, elem);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNotMinus10Then8() {
        int[] data = new int[] {2, 10, 30, 50, 40, 1, -5, -9, -10};
        int elem = -10;
        int result = FindLoop.indexOf(data, elem);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int el = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int el = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThenReturnFirstFound() {
        int[] data = new int[] {5, 10, 2, 4, 8, 10, 14, 4, 3, 21, 16};
        int el = 10;
        int start = 1;
        int finish = 7;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenWholeDiapasonHasNoNumberThenFail() {
        int[] data = new int[] {5, 10, 2, 4, -8, 4, 14, 4, 3, 21, 16};
        int el = 8;
        int start = 0;
        int finish = 10;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenWholeDiapasonHasNoNumberAtAll() {
        int[] data = {1, 2, 3, 5, 6, 9, -1};
        int el = 10;
        int start = 0;
        int finish = data.length - 1;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenWholeDiapasonHasNoNumberThenSuccess() {
        int[] data = new int[] {5, 10, 2, 4, -8, 4, 14, 4, 3, 21, 16};
        int el = 21;
        int start = 0;
        int finish = 10;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}
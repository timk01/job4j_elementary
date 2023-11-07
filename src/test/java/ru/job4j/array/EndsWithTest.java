package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result).isFalse();
    }

    @Test
    public void whenEndWithPrefixAndPrefixIsBiggerThanWordThenFalse() {
        char[] word = {'H', 'e', 'l'};
        char[] pref = {'H', 'e', 'H', 'e', 'l'};
        boolean result = EndsWith.endsWith(word, pref);
        assertThat(result).isFalse();
    }

    @Test
    public void whenNotEndWithPrefixAndPrefixIsBiggerThanWordThenFalse() {
        char[] word = {'L', 'o'};
        char[] pref = {'H', 'e', 'l', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, pref);
        assertThat(result).isFalse();
    }
}
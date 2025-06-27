package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String in = "Hi, Bot.";
        String result = DummyBot.answer(in);
        String expected = "Hi, SmartAss.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String in = "Bye.";
        String result = DummyBot.answer(in);
        String expected = "See you later.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String in = "Can you add two plus two?";
        String result = DummyBot.answer(in);
        String expected = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("simpleQuestionsAndAnswers")
    void differentCommands(String question, String answer) {
        assertThat(DummyBot.answer(question)).isEqualTo(answer);
    }

    static Stream<Arguments> simpleQuestionsAndAnswers() {
        return Stream.of(
                Arguments.of("Hi, Bot.", "Hi, SmartAss."),
                Arguments.of("Bye.", "See you later."),
                Arguments.of("Can you add two plus two?", "I don't know. Please, ask another question.")
        );
    }
}
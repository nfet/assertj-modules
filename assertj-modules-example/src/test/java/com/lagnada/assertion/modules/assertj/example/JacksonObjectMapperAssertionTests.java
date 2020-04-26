package com.lagnada.assertion.modules.assertj.example;

import org.junit.jupiter.api.Test;

import static com.lagnada.assertion.modules.assertj.jackson.objectmapper.Assertions.assertThatx;

public class JacksonObjectMapperAssertionTests {

    @Test
    void assertionIsEqualTo() {
        assertThatx("hello").isEqualTo("hello");
    }

    @Test
    void assertionIsNotEqualTo() {
        assertThatx("hello").isNotEqualTo("world");
    }

}

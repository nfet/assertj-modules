package com.lagnada.assertion.modules.assertj.jackson.objectmapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AssertionsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void assertThatx() {
        Assertions.assertThatx("hello").as("hello test")
                .isEqualTo("hello");
    }

}
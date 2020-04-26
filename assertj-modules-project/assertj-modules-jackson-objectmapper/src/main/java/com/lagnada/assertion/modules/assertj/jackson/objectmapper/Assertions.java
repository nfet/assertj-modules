package com.lagnada.assertion.modules.assertj.jackson.objectmapper;

import org.assertj.core.api.ObjectAssert;

public abstract class Assertions extends org.assertj.core.api.Assertions {

    public static <T> ObjectAssert<T> assertThatx(T actual) {
        return org.assertj.core.api.Assertions.assertThat(actual);
    }

}

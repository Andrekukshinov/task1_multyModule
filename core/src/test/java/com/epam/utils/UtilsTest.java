package com.epam.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class UtilsTest {
    private static final String[] INPUT_NUMBERS = {"12", "", "103", "0", "AVD"};
    private static final String[] EXPECTED = {"", "0", "AVD"};

    @Test
    void getNegativeAndStrings() {
        List<String> actual = Utils.getNegativeAndStrings(INPUT_NUMBERS);
        Assertions.assertEquals(List.of(EXPECTED), actual);
    }
}

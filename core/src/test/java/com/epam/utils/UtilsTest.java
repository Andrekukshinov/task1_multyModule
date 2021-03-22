package com.epam.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    private static final String[] START = {"12", "", "103", "0", "AVD"};
    private static final String[] EXPECTED = {"", "0", "AVD"};


    @Test
    void getNegativeAndStrings() {
        List<String> actual = Utils.getNegativeAndStrings(START);
        Assertions.assertEquals(List.of(EXPECTED), actual);
    }
}

package com.epam.utils;

import com.epam.utils.utils.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }

    public static List<String> getNegativeAndStrings(String... str) {
       return Arrays.stream(str).filter(number-> !StringUtils.isPositiveNumber(number)).collect(Collectors.toList());
    }
}

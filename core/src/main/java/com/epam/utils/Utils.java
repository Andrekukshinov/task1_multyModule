package com.epam.utils;

import com.epam.utils.utils.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.collections4.CollectionUtils;
//import org.apache.commons.lang3.StringUtils;



public class Utils {

    private static final String POSITIVE_NUMBERS = "^([1-9])[0-9]*$";
    private static final Pattern PATTERN = Pattern.compile(POSITIVE_NUMBERS);

    public static boolean isAllPositiveNumbers(String... str) {
       return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }
//
//    public static List<String> getNegativeAndStrings(String... str) {
//        return (List<String>)CollectionUtils.selectRejected(
//                List.of(str),
//                (value)-> PATTERN.matcher(value).matches()
//        );
//    }

    public static List<String> getNegativeAndStrings(String... str) {
        return (List<String>)CollectionUtils.selectRejected(
                List.of(str),
                StringUtils::isPositiveNumber
        );
    }
}

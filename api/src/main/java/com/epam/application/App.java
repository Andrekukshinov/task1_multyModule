package com.epam.application;

import com.epam.utils.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class);
    private static final String SEVENTY_NINE = "79";
    private static final String TWELVE = "12";
    private static final String MESSAGE = "not positive values are: ";

    public static void main(String[] args) {
        process();
    }

    private static void process() {
        String[] values = {TWELVE, SEVENTY_NINE};
        boolean allPositiveNumbers = Utils.isAllPositiveNumbers(values);
        if (!allPositiveNumbers) {
            List<String> negativeAndStrings = Utils.getNegativeAndStrings(values);
            LOGGER.info(MESSAGE + negativeAndStrings);
            //b4 2nd cmmt
        }
    }
}

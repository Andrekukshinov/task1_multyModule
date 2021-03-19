package com.epam.application;

import com.epam.utils.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class);
    private static final String SEVENTY_NINE = "79";
    private static final String TWELVE = "12";
    private static final String MESSAGE = "not all values are positive";

    public static void main(String[] args) {
        process();
    }
    public static void process() {
        boolean allPositiveNumbers = Utils.isAllPositiveNumbers(TWELVE, SEVENTY_NINE);
        if(!allPositiveNumbers){
            LOGGER.info(MESSAGE);
        }
    }
}

package com.wiley.realworldjava.logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingWithParameters {

    private static final Logger LOGGER = LogManager.getLogger(LoggingWithParameters.class.getName());
    private static final Logger FORMATTER_LOGGER = LogManager.getFormatterLogger(LoggingWithParameters.class.getName());

    public static void main(String[] args) {
        LOGGER.fatal("{}: {} is {}/{}", "Division", 1.5, 3, 2);
        FORMATTER_LOGGER.fatal("%s: %.1f is %d/%d", "Division", 1.5, 3, 2);
    }
}

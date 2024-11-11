package com.wiley.realworldjava.logging.jul;

import java.util.logging.Logger;

public class LoggingWIthParameters {

    private static final Logger LOGGER = Logger.getLogger(LoggingWIthParameters.class.getName());


    public static void main(String[] args) {
        LOGGER.severe(String.format("%s: %.1f is %d/%d", "Division", 1.5, 3, 2));
    }

}

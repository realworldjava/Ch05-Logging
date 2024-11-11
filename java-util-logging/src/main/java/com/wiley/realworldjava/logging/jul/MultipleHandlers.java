package com.wiley.realworldjava.logging.jul;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class MultipleHandlers {

    static {System.setProperty("java.util.logging.config.file", "src/main/resources/logging-multiple-handlers.properties");};
    private static final Logger LOGGER = Logger.getLogger(MultipleHandlers.class.getName());

    public static void main(String[] args) {
        LOGGER.severe("Log to two places");
    }
}

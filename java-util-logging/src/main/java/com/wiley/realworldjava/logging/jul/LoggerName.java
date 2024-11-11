package com.wiley.realworldjava.logging.jul;

import java.util.logging.Logger;

public class LoggerName {

    static {System.setProperty("java.util.logging.config.file", "src/main/resources/logging-name.properties");};
    private static final Logger LOGGER = Logger.getLogger("CustomLogger");

    public static void main(String[] args) {
        LOGGER.info("just to let you know");
    }
}

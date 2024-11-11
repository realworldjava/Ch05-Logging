package com.wiley.realworldjava.logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingWithLambda {

    private static final Logger LOGGER = LogManager.getLogger();


    public static void main(String[] args) {
        LOGGER.error(() -> generateMessage());
    }

    private static String generateMessage() {
        return "This is an expensive message";
    }
}

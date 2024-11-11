package com.wiley.realworldjava.logging.jul;

import java.util.logging.Logger;

public class LoggingWithLambda {

    private static final Logger LOGGER = Logger.getLogger(LoggingWithLambda.class.getName());


    public static void main(String[] args) {
        LOGGER.fine(() -> generateMessage());
    }

    private static String generateMessage() {
        return "This is an expensive message";
    }
}

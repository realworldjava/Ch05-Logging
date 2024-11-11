package com.wiley.realworldjava.logging.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jWithPartialLambda {

    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jWithPartialLambda.class);

    public static void main(String[] args) {
        LOGGER.atDebug()
                .setMessage("Message with expensive parameter {}")
                .addArgument(() -> generateParameterToFillInMessage())
                .log();
    }

    private static String generateParameterToFillInMessage() {
        return "This is an expensive parameter";
    }
}

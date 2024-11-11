package com.wiley.realworldjava.logging.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jWithLambda {

    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jWithLambda.class);

    public static void main(String[] args) {
        LOGGER.atDebug()
                .setMessage(() -> generateMessage())
                .addArgument(() -> generateParameterToFillInMessage())
                .log();
    }

    private static String generateMessage() {
        return "This is an expensive message  with parameter: {}";
    }

    private static String generateParameterToFillInMessage() {
        return "This is an expensive parameter";
    }
}

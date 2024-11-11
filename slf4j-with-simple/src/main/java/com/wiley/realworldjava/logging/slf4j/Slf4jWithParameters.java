package com.wiley.realworldjava.logging.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jWithParameters {

    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jWithParameters.class);

    public static void main(String[] args) {
        LOGGER.error("{}: {} is {}/{}", "Division", 1.5, 3, 2);
        LOGGER.error(String.format("%s: %.1f is %d/%d", "Division", 1.5, 3, 2));
    }
}

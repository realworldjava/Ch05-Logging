package com.wiley.realworldjava.logging.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoUnderlyingImplementation {

    private static final Logger LOGGER = LoggerFactory.getLogger(NoUnderlyingImplementation.class);

    public static void main(String[] args) {
        LOGGER.info("just to let you know");
    }
}

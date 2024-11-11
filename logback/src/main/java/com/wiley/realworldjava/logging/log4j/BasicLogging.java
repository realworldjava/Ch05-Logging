package com.wiley.realworldjava.logging.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicLogging {

    private static final Logger LOGGER = LoggerFactory.getLogger(BasicLogging.class);

    public static void main(String[] args) {
        LOGGER.info("just to let you know");
    }
}

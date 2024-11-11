package com.wiley.realworldjava.logging.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jSimple {

    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jSimple.class);

    public static void main(String[] args) {
        LOGGER.info("just to let you know");
    }
}

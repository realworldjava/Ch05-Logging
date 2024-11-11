package com.wiley.realworldjava.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SwitchingLogger {

    static {System.setProperty("java.util.logging.config.file", "src/main/resources/logging.properties");};
    private static final Logger LOGGER = LoggerFactory.getLogger(SwitchingLogger.class);

    public static void main(String[] args) {
        LOGGER.error("this is bad");
        LOGGER.warn("be careful");
        LOGGER.info("just to let you know");
    }
}

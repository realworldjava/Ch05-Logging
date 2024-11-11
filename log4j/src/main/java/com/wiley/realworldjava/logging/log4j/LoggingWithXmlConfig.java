package com.wiley.realworldjava.logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingWithXmlConfig {

    static { System.setProperty("log4j2.configurationFile", "src/main/resources/log4j2-config.xml"); }

    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.fatal("ending!");
        LOGGER.error("this is bad");
        LOGGER.warn("be careful");
        LOGGER.info("just to let you know");
        LOGGER.debug("let's find the problem");
    }
}

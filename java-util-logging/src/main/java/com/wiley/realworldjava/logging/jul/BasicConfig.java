package com.wiley.realworldjava.logging.jul;

import java.util.logging.Logger;

public class BasicConfig {

    static {System.setProperty("java.util.logging.config.file", "src/main/resources/logging-warning.properties");};
    private static final Logger LOGGER = Logger.getLogger(BasicConfig.class.getName());

    public static void main(String[] args) {
        LOGGER.severe("this is bad");
        LOGGER.warning("be careful");
        LOGGER.info("just to let you know");
    }
}

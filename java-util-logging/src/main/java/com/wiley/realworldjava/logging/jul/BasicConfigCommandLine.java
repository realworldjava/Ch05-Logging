package com.wiley.realworldjava.logging.jul;

import java.util.logging.Logger;

public class BasicConfigCommandLine {
    private static final Logger LOGGER = Logger.getLogger(BasicConfigCommandLine.class.getName());

    public static void main(String[] args) {
        LOGGER.severe("this is bad");
        LOGGER.warning("be careful");
        LOGGER.info("just to let you know");
    }
}

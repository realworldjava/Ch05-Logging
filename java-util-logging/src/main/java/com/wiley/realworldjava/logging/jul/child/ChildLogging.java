package com.wiley.realworldjava.logging.jul.child;

import java.util.logging.Logger;

public class ChildLogging {

    private static final Logger LOGGER = Logger.getLogger(ChildLogging.class.getName());

    public static void log() {
        LOGGER.severe("Child logging");
        LOGGER.warning("Child logging");
    }
}

package com.wiley.realworldjava.logging.log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingWithPrintf {

    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.printf(Level.FATAL, "%s: %.1f is %d/%d", "Division", 1.5, 3, 2);
    }
}

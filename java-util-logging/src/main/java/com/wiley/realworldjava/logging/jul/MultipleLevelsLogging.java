package com.wiley.realworldjava.logging.jul;

import com.wiley.realworldjava.logging.jul.child.ChildLogging;

import java.util.logging.Logger;

public class MultipleLevelsLogging {

    static {System.setProperty("java.util.logging.config.file", "src/main/resources/logging-inheritance.properties");};
    private static final Logger LOGGER = Logger.getLogger(MultipleLevelsLogging.class.getName());

    public static void main(String[] args) {
       LOGGER.severe("Parent logging");
       LOGGER.warning("Parent logging");

       ChildLogging.log();
    }
}

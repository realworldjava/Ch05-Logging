package com.wiley.realworldjava.logging.jul;

import java.util.logging.Logger;

public class MultipleLevelsLoggingWithManualHierarchy {

    static {System.setProperty("java.util.logging.config.file", "src/main/resources/logging-inheritance-manually.properties");};

    public static void main(String[] args) {
        Logger parentLogger = Logger.getLogger("custom");
        Logger childLogger = Logger.getLogger("custom.child");

        parentLogger.severe("Parent logging");
        parentLogger.warning("Parent logging");
        childLogger.severe("Child logging");
        childLogger.warning("Child logging");
    }
}

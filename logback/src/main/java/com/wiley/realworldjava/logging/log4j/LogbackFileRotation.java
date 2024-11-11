package com.wiley.realworldjava.logging.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class LogbackFileRotation {

    static { System.setProperty("logback.configurationFile", "src/main/resources/logback-file-rotation.xml"); }

    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackFileRotation.class);

    public static void main(String[] args) {
        var longMessage = "-".repeat(1_000);
        Stream.generate(() -> String.format("Logging data: %s %s", longMessage, Math.random()))
                .limit(100)
                .forEach(s -> logSlowly(s));
    }

    private static void logSlowly(String text) {
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            // ignore
        }
        LOGGER.error(text);
    }
}

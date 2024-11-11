package com.wiley.realworldjava.logging.jul;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class LoggingFormat {

    static {System.setProperty("java.util.logging.config.file", "src/main/resources/logging-format.properties");};
    private static final Logger LOGGER = Logger.getLogger(LoggingFormat.class.getName());

    public static void main(String[] args) {
        Stream.generate(() -> String.format("Logging message"))
                .limit(1_000)
                .forEach(LOGGER::severe);
    }
}

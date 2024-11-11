package com.wiley.realworldjava.logging.jul;

import java.util.Random;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class FileRotationLogging {

    static {System.setProperty("java.util.logging.config.file", "src/main/resources/logging-file-rotation.properties");};
    private static final Logger LOGGER = Logger.getLogger(FileRotationLogging.class.getName());

    public static void main(String[] args) {
        Stream.generate(() -> String.format("Logging data: %s", Math.random()))
                .limit(1_000)
                .forEach(LOGGER::severe);
    }
}

package com.wiley.realworldjava.logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Stream;

public class FileRotationLoggingWithYaml {

    static {System.setProperty("log4j2.configurationFile", "src/main/resources/log4j2-config-file.yaml");};
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        Stream.generate(() -> String.format("Logging data: %s", Math.random()))
                .limit(1_000_000)
                .forEach(LOGGER::fatal);
    }
}

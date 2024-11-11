package com.wiley.realworldjava.logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetLoggerEquivalents {

    private static final Logger LOGGER_1 = LogManager.getLogger();
    private static final Logger LOGGER_2 = LogManager.getLogger(GetLoggerEquivalents.class);
    private static final Logger LOGGER_3 = LogManager.getLogger(GetLoggerEquivalents.class.getName());

    public static void main(String[] args) {
        LOGGER_1.fatal("this is bad");
        LOGGER_2.fatal("this is bad");
        LOGGER_3.fatal("this is bad");
    }
}

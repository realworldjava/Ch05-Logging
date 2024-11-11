package com.wiley.realworldjava.logging.jul;

import java.util.logging.Logger;

public class BasicLogging {
    private static final Logger LOGGER = Logger.getLogger(BasicLogging.class.getName());

    public static void main(String[] args) {
       LOGGER.severe("Something bad happened!");
    }
}

package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {
    private static final Logger LOGGER = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Application started.");
        LOGGER.warning("A warning occurred. Check the configuration settings.");
        LOGGER.log(Level.SEVERE, "A severe error occurred while processing the request.");
        LOGGER.info("Application finished.");
    }
}

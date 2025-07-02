package com.example.slf4jlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {
    private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {
        logger.info("Application started.");

        try {
            int result = 10 / 0; // Will cause ArithmeticException
        } catch (Exception ex) {
            logger.error("An error occurred: {}", ex.getMessage(), ex);
        }

        logger.warn("This is a warning message about potential issues.");

        logger.info("Application finished.");
    }
}

package com.yahya.tests.day10_driver_method;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PropertyFileReadTest {

    @Test
    public void testInitialRead() throws FileNotFoundException {

        // Open connection to file using FileInputStream
        FileInputStream fileInputStream = new FileInputStream("config.properties");




    }
}

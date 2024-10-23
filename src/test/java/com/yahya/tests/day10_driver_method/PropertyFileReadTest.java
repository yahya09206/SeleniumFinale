package com.yahya.tests.day10_driver_method;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReadTest {

    @Test
    public void testInitialRead() throws IOException {

        // Open connection to file using FileInputStream
        FileInputStream fileInputStream = new FileInputStream("config.properties");

        // Create empty Properties object
        Properties myProperty = new Properties();
        // Load the fileInputStream into the Properties object
        myProperty.load(fileInputStream);
        // close the connection by calling close method of FileInputStream
        fileInputStream.close();

        // Read from properties using key
        String helloValue = myProperty.getProperty("hello");
        System.out.println("helloValue = " + helloValue);


    }
}

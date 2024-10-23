package com.yahya.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    //Declare Properties object at class level so it can be accessible in static method
    private static Properties properties =  new Properties();

    static {
        try {
            FileInputStream inputStream = new FileInputStream("config.properties");
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e ){
            e.printStackTrace();
        }
    }

    /**
     * Read from the file
     */
    public static String read(String key){

        return properties.getProperty(key);
    }
}

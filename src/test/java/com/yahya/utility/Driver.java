package com.yahya.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * A class with a method that will only return a Single object no matter how many times you ask for it
 * Technique used from singleton pattern
 */
public class Driver {

    private static WebDriver obj;

    private Driver(){

    }

    public static WebDriver getDriver(){

        if (obj == null){
            WebDriverManager.chromedriver().setup();
            obj = new ChromeDriver();
            System.out.println("One and only instance");
            return obj;
        } else {
            System.out.println("Instance already exists");
            return obj;
        }
    }
}

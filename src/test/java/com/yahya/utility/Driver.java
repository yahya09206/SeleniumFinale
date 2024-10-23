package com.yahya.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * A class with a method that will only return a Single object no matter how many times you ask for it
 * Technique used from singleton pattern
 */
public class Driver {

    private static WebDriver obj;

    private Driver(){

    }

    public static WebDriver getDriver(){

        String browserName = ConfigReader.read("browser");

        switch (browserName.toLowerCase()){

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                driver = null;
                System.out.println("UNKNOWN BROWSER TYPE " + browserName);;
        }
            return obj;
        }
    }

    public static void closeBrowser(){
        // check if we have WebDriver instance or not
        // basically checking if obj is null or not
        // if not null
        // quit the browser
        // make it null , because once quit it can not be used
        if(obj != null ){
            obj.quit();
            // so when ask for it again , it gives us not quited fresh driver
            obj = null ;
        }
    }
}

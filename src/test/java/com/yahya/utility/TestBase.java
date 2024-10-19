package com.yahya.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This is meant to be a superclass
 * to provide a driver set up and to close the browser for its subclasses
 */

public abstract class TestBase {

    protected WebDriver driver;

    @BeforeEach
    public void setupWebDriver(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}

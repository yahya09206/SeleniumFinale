package com.yahya.utility;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * This is meant to be a superclass
 * to provide a driver set up and to close the browser for its subclasses
 */

public abstract class TestBase {

    protected WebDriver driver;

    @BeforeEach
    public void setupWebDriver(){

//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}

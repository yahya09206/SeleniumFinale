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
        // Instruct driver to wait maximum ammount of time before throwing NoSuchElement Exception by using implicit wait
        // if element is not available, it will wait for a maximum of 10 seconds
        // if element is found before 10s it will move on to next step
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}

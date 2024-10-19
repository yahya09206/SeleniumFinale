package com.yahya.tests.day06_junit_utility_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFormTest {

    WebDriver driver;

    @BeforeEach
    public void yahooPage(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterEach
    public void tearDown(){

        driver.quit();
    }


}

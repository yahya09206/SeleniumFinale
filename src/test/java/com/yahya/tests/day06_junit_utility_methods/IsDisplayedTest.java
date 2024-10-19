package com.yahya.tests.day06_junit_utility_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedTest {

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

    // navigate to form page
    // identify the error message exists but is not displayed
    // enter text 'a' and check the error message is displayed
    @Test
    public void testErrorMsg(){

        driver.navigate().to("https://practice.cydeo.com/registration_form");
        String xpathForErrorMsg = "//small[.='first name must be more than 2 and less than 64 characters long']";

        // Error message will only be displayed after user attempts to login with 2 or less characters
        WebElement stringErrorElement = driver.findElement(By.xpath(xpathForErrorMsg));
        System.out.println("stringErrorElement.isDisplayed() = " + stringErrorElement.isDisplayed());
        Assertions.assertFalse(stringErrorElement.isDisplayed());

        WebElement firstNameField = driver.findElement(By.name("firstname"));
        firstNameField.sendKeys("a");

        System.out.println("stringErrorElement.isDisplayed() = " + stringErrorElement.isDisplayed());
        Assertions.assertTrue(stringErrorElement.isDisplayed());

    }
}

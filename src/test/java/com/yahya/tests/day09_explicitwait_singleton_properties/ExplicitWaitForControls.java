package com.yahya.tests.day09_explicitwait_singleton_properties;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;


public class ExplicitWaitForControls extends TestBase {

    @Test
    public void waitUntilElementInteractable(){

        driver.get("https://practice.cydeo.com/dynamic_controls");

        // elementToBeClickable(By locator)
        // An expectation for checking if an element is visible and enabled such that you can click it

        // click on enable and wait until the input box is enabled and clickable
        driver.findElement(By.xpath("//button[.='Enable']")).click();
        WebElement inputField = driver.findElement(By.cssSelector("form#input-example>input"));
        System.out.println("inputField.isEnabled() = " + inputField.isEnabled());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        //wait.until(elementToBeClickable(By.cssSelector("form#input-example>input")));
        wait.until(elementToBeClickable(inputField));

        // now enter something into the input field
        inputField.sendKeys("Hello World!");

        BrowserUtil.waitFor(5);


    }
}

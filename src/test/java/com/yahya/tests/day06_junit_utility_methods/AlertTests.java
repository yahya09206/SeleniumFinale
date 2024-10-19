package com.yahya.tests.day06_junit_utility_methods;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertTests extends TestBase {

    /**
     * regular(ok0
     * confirmation(ok and cancel)
     * prompt(enter text)
     */
    @Test
    public void testJavaScriptAlert(){

        driver.get("https://practice.cydeo.com/javascript_alerts");

        // Alert interface from Selenium is used to deal with alerts
        // your driver object can switchTo the alert and take some action on it
        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        // the driver first needs to switch to the alert box since it is not part of the html
        // using switchTo() method followed by alert() method
        // .alert() methods returns a type of Alert from Selenium
        // it has 4 options
            // accept() --> click ok button
            // dismiss() --> click on cancel button
            // sendKey(yourText) --> enter text into prompts
            // getText() --> get the text of the alert box
        System.out.println("driver.switchTo().alert().getText() = " + driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();
        System.out.println("The End!!");
    }
}

package com.yahya.tests.day06_junit_utility_methods;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SlowElementTest extends TestBase {

    @Test
    public void testWait(){

        driver.navigate().to("https://practice.cydeo.com/dynamic_controls");
        driver.findElement(By.xpath("//button[.='Remove']")).click();

        WebElement itsGoneElm = driver.findElement(By.id("message"));
        System.out.println("itsGoneElm.getText() = " + itsGoneElm.getText());

    }

}

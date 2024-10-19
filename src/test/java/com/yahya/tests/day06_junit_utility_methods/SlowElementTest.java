package com.yahya.tests.day06_junit_utility_methods;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SlowElementTest extends TestBase {

    @Test
    public void testWait(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Instruct driver to wait maximum ammount of time before throwing NoSuchElement Exception by using implicit wait
        // if element is not available, it will wait for a maximum of 10 seconds
        // if element is found before 10s it will move on to next step
        driver.navigate().to("https://practice.cydeo.com/dynamic_controls");
        driver.findElement(By.xpath("//button[.='Remove']")).click();

        WebElement itsGoneElm = driver.findElement(By.id("message"));
        System.out.println("itsGoneElm.getText() = " + itsGoneElm.getText());

    }

}

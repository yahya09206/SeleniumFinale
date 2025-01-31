package com.yahya.tests.day09_explicitwait_singleton_properties;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class ExplicitWaitTest extends TestBase {

    @Test
    public void testWaitForTitle(){

        //1. navigate to https://practice.cydeo.com/dynamic_loading/7
        driver.get("https://practice.cydeo.com/dynamic_loading");
        //2. click on example 7
        driver.findElement(By.partialLinkText("Example 7")).click();

        //3. The title will show loading.. until a certain time
        // wait until the title value becomes "Dynamic Title"
        // this is how you create WebDriverWait object with driver and a max time to wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // then we use the until method that accepts expected conditions
        // ExpectedConditions helper class has a lot of pre-written conditions
        // for common scenarios, so we don't have to build our own
        // in this case we are checking for title equals dynamic title
        // wait.until(ExpectedConditions.titleIs("Dynamic title"));

        // trying a different condition such as waiting for image to appear
        wait.until(visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")));

        System.out.println("THE END!");

    }

    @Test
    public void testByTextToBe(){

        //1. navigate to https://practice.cydeo.com/dynamic_loading/7
        driver.get("https://practice.cydeo.com/dynamic_loading");
        //2. click on example 7
        driver.findElement(By.partialLinkText("Example 7")).click();

        WebElement alertArea = driver.findElement(By.id("alert"));
        System.out.println("alertArea.getText() = " + alertArea.getText());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // trying a different condition such as waiting for image to appear
        wait.until(visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")));

        // had to re-locate the element because the attributes have changed, driver cannot find it anymore
        // element is no longer in the dom
        alertArea = driver.findElement(By.id("alert"));
        System.out.println("alertArea.getText() = " + alertArea.getText());

    }
}

package com.yahya.tests.day10_driver_method;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.Driver;
import com.yahya.utility.TestBase;
import com.yahya.utility.WebOrderUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebOrderPracticeTest extends TestBase {

    @Test
    public void testDriverPractice(){

        WebOrderUtil.openWebOrderApp();
        //WebOrderUtil.login();
        WebOrderUtil.login("Tester", "test");
        BrowserUtil.waitFor(2);
        Assertions.assertEquals("Web Orders", Driver.getDriver().getTitle());
    }

    @Test
    public void testInvalidCredentials(){

        WebOrderUtil.openWebOrderApp();
        WebOrderUtil.login("bla", "bla");

        WebElement errorMsg = Driver.getDriver().findElement(By.id("ctl00_MainContent_status"));
        Assertions.assertTrue(errorMsg.isDisplayed());
    }

    @Test
    public void testClearInputBox(){

        Actions actions = new Actions(driver);

        WebOrderUtil.openWebOrderApp();
        WebElement usernameField = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameField.sendKeys("adfafsas");
        BrowserUtil.waitFor(2);
        new Actions(driver)
                .click(usernameField)
                .keyDown(Keys.COMMAND)
                .sendKeys("A")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.BACK_SPACE)
                .perform();
        BrowserUtil.waitFor(2);

    }
}

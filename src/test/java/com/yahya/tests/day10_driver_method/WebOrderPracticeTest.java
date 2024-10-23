package com.yahya.tests.day10_driver_method;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.Driver;
import com.yahya.utility.TestBase;
import com.yahya.utility.WebOrderUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
}

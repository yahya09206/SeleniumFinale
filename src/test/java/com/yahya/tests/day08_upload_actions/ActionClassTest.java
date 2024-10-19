package com.yahya.tests.day08_upload_actions;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest extends TestBase {

    @Test
    public void testHoverAction(){

        driver.get("https://practice.cydeo.com/hovers");

        ////div[@class='figure']/img[1]
        WebElement img1Elm = driver.findElement(By.xpath("//div[@class='figure']/img[1]"));

        // create instance of Actions class by passing driver object
        Actions actions = new Actions(driver);
        actions.moveToElement(img1Elm).perform();

        // verify user profile 1 is displayed
        WebElement firstProfileElement = driver.findElement(By.xpath("//h5[.='name: user1']"));
        Assertions.assertTrue(firstProfileElement.isDisplayed());

        BrowserUtil.waitFor(3);
    }
}

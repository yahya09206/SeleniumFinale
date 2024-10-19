package com.yahya.tests.day08_upload_actions;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadTest extends TestBase {

    @Test
    public void testUpload()  {

        driver.get("https://practice.cydeo.com/upload");

        // locate the input: by.id("file-upload")
        WebElement fileInputField = driver.findElement(By.id("file-upload"));
        String filePath = "/Users/solodolo/Downloads/fruit-shop-api-v2-2-0.yml";
        fileInputField.sendKeys(filePath);

        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
        BrowserUtil.waitFor(2);

        WebElement successMsg = driver.findElement(By.xpath("//h3[.='File Uploaded!']"));
        Assertions.assertTrue(successMsg.isDisplayed());
        BrowserUtil.waitFor(2);
    }
}

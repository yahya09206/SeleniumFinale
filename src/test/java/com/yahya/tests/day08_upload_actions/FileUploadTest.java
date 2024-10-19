package com.yahya.tests.day08_upload_actions;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadTest extends TestBase {

    @Test
    public void testUpload() throws InterruptedException {

        driver.get("https://practice.cydeo.com/upload");

        // locate the input: by.id("file-upload")
        WebElement fileInputField = driver.findElement(By.id("file-upload"));
        String filePath = "/Users/solodolo/Downloads/fruit-shop-api-v2-2-0.yml";
        fileInputField.sendKeys(filePath);

        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
        Thread.sleep(1500);
    }
}

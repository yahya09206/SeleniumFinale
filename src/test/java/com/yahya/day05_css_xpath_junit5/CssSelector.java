package com.yahya.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com/forgot_password");

        // locate 2 elements using css selector
        WebElement emailBox = driver.findElement(By.xpath("//button[@id='form_submit']"));
        emailBox.sendKeys("someone@someone.com");
        Thread.sleep(1000);
        emailBox.click();

        WebElement retrieveBtn = driver.findElement(By.cssSelector("button[id='form_submit']"));
        retrieveBtn.click();

        Thread.sleep(1000);
        driver.quit();
    }
}

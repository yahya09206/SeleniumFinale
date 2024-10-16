package com.yahya.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByTagName {
    public static void main(String[] args) {

        /**
         * Purple tagname
         * Orange att name
         * Blue att value
         * Black text value
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com");

        WebElement firstLink = driver.findElement(By.tagName("a"));
        System.out.println(firstLink.getText());

        driver.quit();
    }
}

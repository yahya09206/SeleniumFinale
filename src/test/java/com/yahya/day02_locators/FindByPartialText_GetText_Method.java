package com.yahya.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByPartialText_GetText_Method {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com");

        // Identify the link using partial link text then get the full text Disappearing Elements
        WebElement addRemove = driver.findElement(By.partialLinkText("Disappearing"));
        System.out.println(addRemove.getText());

        driver.quit();

    }
}

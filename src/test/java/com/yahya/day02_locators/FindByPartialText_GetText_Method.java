package com.yahya.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindByPartialText_GetText_Method {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com");

        // Identify the link using partial link text then get the full text Disappearing Elements
        WebElement addRemove = driver.findElement(By.partialLinkText("Disappearing"));
        System.out.println(addRemove.getText());

        // Provide partial link as the letter "a"
        // Should return the first one
        WebElement aLinks = driver.findElement(By.partialLinkText("A"));
        System.out.println("aLinks.getText() = " + aLinks.getText());

        List<WebElement> allALinks = driver.findElements(By.partialLinkText("A"));
        for (WebElement allALink : allALinks) {
            System.out.println(allALink.getText());
        }

        driver.quit();

    }
}

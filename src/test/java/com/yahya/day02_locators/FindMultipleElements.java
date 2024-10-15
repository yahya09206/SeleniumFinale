package com.yahya.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindMultipleElements {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com");

        // Identify the link using partial link text then get the full text Disappearing Elements
        WebElement addRemove = driver.findElement(By.partialLinkText("Disappearing"));
        System.out.println(addRemove.getText());

        // Find all elements that match partial link text
        List<WebElement> allALinks = driver.findElements(By.partialLinkText("A"));
        System.out.println(allALinks.size());
        for (WebElement allALink : allALinks) {
            System.out.println(allALink.getText());
        }

        // Get the first item
        WebElement firstItem = allALinks.get(0);
        System.out.println(firstItem.getText());

        // Get the second item
        WebElement secondItem = allALinks.get(1);
        System.out.println(secondItem.getText());

        driver.quit();
    }
}

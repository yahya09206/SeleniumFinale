package com.yahya.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com");

        // get the first link on the page and get href attribute
        WebElement firstLink = driver.findElement(By.partialLinkText("A/B"));
        System.out.println(firstLink.getText());
        System.out.println(firstLink.getAttribute("href"));

        // navigate to google.com and identify searchbox and get a couple of attributes values
        driver.navigate().to("https://google.com");

        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        System.out.println(searchBox.getAttribute("title"));
        System.out.println(searchBox.getAttribute("spellcheck"));

        driver.quit();
    }
}

package com.yahya.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPartialLinkText {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com");

        // Click on first link "A/B Testing"
        WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));
        firstLink.click();

        Thread.sleep(1500);
        // navigate back to home page
        driver.navigate().back();
        Thread.sleep(1500);

        driver.manage().window().maximize();
        // click on second link
        WebElement secondLink = driver.findElement(By.linkText("Add/Remove Elements"));
        secondLink.click();
        Thread.sleep(1500);
        // click on "Home" link to go back home
        driver.findElement(By.linkText("Home")).click();
        Thread.sleep(1500);
        // click on "Redirect Link"
        WebElement redirect = driver.findElement(By.linkText("Redirect"));
        Thread.sleep(1500);

        driver.quit();
    }
}

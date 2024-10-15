package com.yahya.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByID_byName_ByLinkText {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");

        // name: email, pass, login
        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys("some email here");

        WebElement passwordBox = driver.findElement(By.name("pass"));
        passwordBox.sendKeys("bla bla");

        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.clear();

        Thread.sleep(3000);
        driver.quit();
    }
}

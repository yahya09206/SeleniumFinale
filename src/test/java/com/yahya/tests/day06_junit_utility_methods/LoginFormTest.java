package com.yahya.tests.day06_junit_utility_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFormTest {

    WebDriver driver;

    @BeforeEach
    public void yahooPage(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterEach
    public void tearDown(){

        driver.quit();
    }

    @Test
    public void testLogin(){

        driver.get("http://practice.cydeo.com/login");

        WebElement header = driver.findElement(By.xpath("//h2[.='Login Page']"));
        System.out.println("header.getText() = " + header.getText());

        driver.findElement(By.xpath("//div/input[@name='username']")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys("SuperSecretPassword");

        driver.findElement(By.id("wooden_spoon")).click();

        WebElement successMsg = driver.findElement(By.xpath("//div/div[@class='flash success']"));

        String expectedResult = "You logged into a secure area!";
        Assertions.assertTrue(successMsg.getText().startsWith(expectedResult));
    }


}

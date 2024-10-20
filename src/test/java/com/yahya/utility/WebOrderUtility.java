package com.yahya.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebOrderUtility {

    public static void login(WebDriver driverParam){

        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void login(WebDriver driverParam, String username, String password){

        driverParam.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        driverParam.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        driverParam.findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void logout(WebDriver driver){
        driver.findElement(By.id("ctl00_logout")).click();
    }
}

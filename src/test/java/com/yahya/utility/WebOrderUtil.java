package com.yahya.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebOrderUtil {

    // Create a method to openWebOrderApp

    public static void openWebOrderApp(){

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
    }

    public static void login(){

        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();
    }

    public static void login(String username, String password){

        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();
    }


}

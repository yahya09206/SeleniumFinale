package com.yahya.tests.day09_explicitwait_singleton_properties;

import com.yahya.utility.BrowserUtil;
import com.yahya.utility.TestBase;
import com.yahya.utility.WebOrderUtility;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class WebOrderTest extends TestBase {

    @Test
    public void testLogin(){

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
//        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
//        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        WebOrderUtility.login(driver);
        WebOrderUtility.login(driver, "Tester", "test");

        BrowserUtil.waitFor(4);
    }
}

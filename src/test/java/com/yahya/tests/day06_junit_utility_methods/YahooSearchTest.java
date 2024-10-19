package com.yahya.tests.day06_junit_utility_methods;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class YahooSearchTest extends TestBase {

    @Test
    public void testYahooSearchHomePage(){

        driver.get("https://search.yahoo.com");
        String expectedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void testYahooSearchResultPage(){

        driver.get("https://search.yahoo.com");
        driver.findElement(By.name("p")).sendKeys("selenium" + Keys.ENTER);

        Assertions.assertTrue(driver.getTitle().startsWith("selenium"));

    }
}

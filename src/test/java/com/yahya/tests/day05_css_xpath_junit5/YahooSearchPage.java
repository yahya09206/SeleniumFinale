package com.yahya.tests.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchPage {

    /**
     * Write 2 tests :
     *
     * tests when you navigate to yahoo search page the title should be "Yahoo Search = Web Search"
     *
     * test when you search for Selenium the title should start with selenium
     */

    @Test
    public void testYahooSearchHomePageTitle(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://search.yahoo.com/");

        String expectedTitle = "Yahoo Search - Web Search";
        Assertions.assertEquals(expectedTitle, driver.getTitle());

        driver.quit();
    }
}

package com.yahya.tests.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchPage {

    /**
     * Write 2 tests :
     *
     * tests when you navigate to yahoo search page the title should be "Yahoo Search = Web Search"
     *
     * test when you search for Selenium the title should start with selenium
     */

    WebDriver driver = new ChromeDriver();

    @BeforeEach
    public void yahooPage(){

        WebDriverManager.chromedriver().setup();
        driver.navigate().to("https://search.yahoo.com/");

    }

    @Test
    public void testYahooSearchHomePageTitle(){

        String expectedTitle = "Yahoo Search - Web Search";
        Assertions.assertEquals(expectedTitle, driver.getTitle());

        driver.quit();

    }

    @Test
    public void testYahooSearchResultPageTitle(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://search.yahoo.com/");

        WebElement searchBox = driver.findElement(By.xpath("//div/input[@id='yschsp']"));
        searchBox.sendKeys("Selenium", Keys.ENTER);

        Assertions.assertTrue(driver.getTitle().startsWith("Selenium"));

        driver.quit();

    }
}

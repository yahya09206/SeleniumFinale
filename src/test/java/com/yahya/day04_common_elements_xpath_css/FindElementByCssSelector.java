package com.yahya.day04_common_elements_xpath_css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCssSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://search.yahoo.com/");

        // TODO: Identify yahoo search box using CssSelector

        WebElement searchBox = driver.findElement(By.cssSelector("input[name='p'"));
        searchBox.sendKeys("Selenium FTW!!!!");
        System.out.println("searchBox.getText() = " + searchBox.getText());
        Thread.sleep(1500);

        WebElement clearIcon = driver.findElement(By.cssSelector("button#sbq-clear>span"));
        clearIcon.click();

        searchBox.sendKeys("XPATH");

        WebElement searchIcon = driver.findElement(By.cssSelector("button[type='submit']"));
        searchIcon.click();

        Thread.sleep(1000);

        driver.quit();
    }
}

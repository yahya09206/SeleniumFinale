package com.yahya.day04_common_elements_xpath_css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingDropdownList {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com/dropdown");

        // TODO: identify the first dropdown
        WebElement yearDropdown = driver.findElement(By.id("year"));

        // TODO: wrap it up using Select class so you can use its methods
        Select yearObj = new Select(yearDropdown);

        // TODO: select items in 3 different ways
        yearObj.selectByIndex(2);

        // select item with value attribute 2019
        yearObj.selectByValue("2019");

        // select item with visible text 1990
        yearObj.selectByVisibleText("1990");

        driver.quit();
    }
}

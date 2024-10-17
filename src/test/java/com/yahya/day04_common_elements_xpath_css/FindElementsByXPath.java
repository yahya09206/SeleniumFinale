package com.yahya.day04_common_elements_xpath_css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsByXPath {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com/");

        ///html/body/div[1]/div[2]/div/div/div/h1/span

        // using above full xpath to identify the element and get the text
        WebElement headerElm = driver.findElement(By.xpath("//div/h1/span[@class='h1y']"));
        System.out.println("headerElm.getText() = " + headerElm.getText());

        driver.quit();
    }
}

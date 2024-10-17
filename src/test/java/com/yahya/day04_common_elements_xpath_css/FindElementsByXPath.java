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

        // using relative path to find h1 header text
        WebElement headSpan = driver.findElement(By.xpath("//h1/span"));
        System.out.println(headSpan.getText());

        // providing attributes in xpath
        // elementTag[@attributeName='attribute value']
        // if you have more than 1 attribute
            // elementTag[@attributeName='attribute value' and @attributeName='attributeValue']
        // also have the option to provide index
        // can also provide use text() xpath function
            // //elementTag[text()='some text value goes here']

        // click on checkboxes link to go to checkboxes page
        driver.findElement(By.xpath("//li/a[text()='Checkboxes']")).click();

        // identify header and get the text from 1st checkbox
        WebElement h1Text = driver.findElement(By.xpath("//span[text()='Checkbox 1']"));
        System.out.println("h1Text.getText() = " + h1Text.getText());

        driver.quit();
    }
}

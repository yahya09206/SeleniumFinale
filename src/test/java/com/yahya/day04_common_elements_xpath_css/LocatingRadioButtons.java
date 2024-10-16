package com.yahya.day04_common_elements_xpath_css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingRadioButtons {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com/radio_buttons");


        // locating the blue radio button
        WebElement blueRadio = driver.findElement(By.id("blue"));
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());

        // locating the blue radio button
        WebElement redRadio = driver.findElement(By.id("red"));
        System.out.println("redRadio = " + redRadio);

        // locating the blue radio button
        WebElement yellowRadio = driver.findElement(By.id("yellow"));
        System.out.println("yellowRadio = " + yellowRadio);

        // locating the blue radio button
        WebElement blackRadio = driver.findElement(By.id("black"));
        System.out.println("blackRadio = " + blackRadio);

        // locating the blue radio button
        WebElement greenRadio = driver.findElement(By.id("green"));
        System.out.println("greenRadio.isSelected() = " + greenRadio.isSelected());
        driver.quit();
    }
}

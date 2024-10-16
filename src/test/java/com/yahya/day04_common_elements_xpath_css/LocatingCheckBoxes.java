package com.yahya.day04_common_elements_xpath_css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingCheckBoxes {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com/checkboxes");

        // Identify first checkbox
        WebElement checkbox1 = driver.findElement(By.id("box1"));
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.getAttribute("checked");

        WebElement checkbox2 = driver.findElement(By.id("box2"));
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        checkbox2.getAttribute("checked");

        checkbox1.click();
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox2.click();
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        if (!checkbox1.isSelected()){
            checkbox1.click();
        } else {
            System.out.println("Take it easy, already checked");
        }

        if (!checkbox2.isSelected()){
            checkbox2.click();
        } else {
            System.out.println("Take it easy, already checked");
        }



        driver.quit();
    }
}

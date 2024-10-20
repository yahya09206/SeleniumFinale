package com.yahya.tests.day09_explicitwait_singleton_properties;

import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ExplicitWaitTest extends TestBase {

    @Test
    public void testWaitForTitle(){

        //1. navigate to https://practice.cydeo.com/dynamic_loading/7
        driver.get("https://practice.cydeo.com/dynamic_loading/7");
        //2. click on example 7
        driver.findElement(By.partialLinkText("Example 7")).click();

        //3. The title will show loading.. until a certain time
        // wait until the title value becomes "Dynamic Title"

    }
}

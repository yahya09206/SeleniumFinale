package com.yahya.tests.day05_css_xpath_junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    public void testAddition(){

        int num1 = 10;
        int num2 = 7;
        int expectedResult = 17;
        Assertions.assertEquals(expectedResult, num1 + num2);
    }

    @Test
    public void testString(){

        String msg = "I love selenium";
        // Assert that the message equals "I love selenium"
        // below assert method accepts 2 params
        Assertions.assertEquals("I love selenium", msg);

        // Assert this message starts with "I love"
        // Assert true accepts 1 param as boolean
        Assertions.assertTrue(msg.startsWith("I love"));
    }
}

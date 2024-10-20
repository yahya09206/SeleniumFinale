package com.yahya.tests.day09_explicitwait_singleton_properties;

import com.yahya.utility.Driver;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;

public class SingletonTest extends TestBase {

    @Test
    public void testDriverUtilClass(){

        Driver.getDriver();
        Driver.getDriver();
        Driver.getDriver();
    }

    @Test
    public void testSingleton(){

        Singleton singleton = new Singleton();
        singleton.word = "abc";


    }
}

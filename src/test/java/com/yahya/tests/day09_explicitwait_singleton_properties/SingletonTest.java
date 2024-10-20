package com.yahya.tests.day09_explicitwait_singleton_properties;

import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void testSingleton(){

        Singleton singleton = new Singleton();
        singleton.word = "abc";


    }
}

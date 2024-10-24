package com.yahya.tests.day11_property_driver_faker_pom;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class FakerTest {

    @Test
    public void testPrintFakeData(){

        Faker fake = new Faker();

        System.out.println("fake.name().fullName() = " + fake.name().fullName());
    }
}

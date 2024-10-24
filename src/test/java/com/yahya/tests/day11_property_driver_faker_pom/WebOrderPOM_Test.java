package com.yahya.tests.day11_property_driver_faker_pom;

import com.yahya.pages.WLogin;
import com.yahya.utility.ConfigReader;
import com.yahya.utility.Driver;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;

public class WebOrderPOM_Test extends TestBase {

    @Test
    public void testWithPOM_for_login(){


        WLogin login = new WLogin();

        login.goTo();
        //login.login("Tester", "test");
        login.login(ConfigReader.read("weborder_username"), ConfigReader.read("weborder_password"));

    }
}

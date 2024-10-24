package com.yahya.tests.day11_property_driver_faker_pom;

import com.yahya.pages.WLogin;
import com.yahya.utility.Driver;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Test;

public class WebOrderPOM_Test extends TestBase {

    @Test
    public void testWithPOM_for_login(){


        WLogin login = new WLogin();

        login.userNameField.sendKeys("Tester");
        login.passwordField.sendKeys("test");
        login.loginButton.click();
    }
}

package com.yahya.tests.day11_property_driver_faker_pom;

import com.yahya.pages.WAllOrderPage;
import com.yahya.pages.WLogin;
import com.yahya.utility.BrowserUtil;
import com.yahya.utility.ConfigReader;
import com.yahya.utility.Driver;
import com.yahya.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WebOrderPOM_Test extends TestBase {

    @Test
    public void testWithPOM_for_login(){


        WLogin login = new WLogin();

        login.goTo();
        login.login("Teste", "test");
        //login.login(ConfigReader.read("weborder_username"), ConfigReader.read("weborder_password"));
        Assertions.assertTrue(login.loginErrorMsg());

        BrowserUtil.waitFor(2);

    }

    @Test
    public void testAllOrderPage(){

        WLogin login = new WLogin();
        login.goTo();
        login.login("Tester", "test");

        //All order page
        WAllOrderPage allOrderPage = new WAllOrderPage();

        //Assert that header is display to verify correct page
        Assertions.assertTrue(allOrderPage.header.isDisplayed());

        allOrderPage.checkAllButton.click();
        BrowserUtil.waitFor(2);
        allOrderPage.uncheckAllButton.click();

        // print out the size of all the headerCells
        System.out.println("allOrderPage.headerCells.size() = " + allOrderPage.headerCells.size());
        Assertions.assertEquals(13, allOrderPage.headerCells.size());
    }
}

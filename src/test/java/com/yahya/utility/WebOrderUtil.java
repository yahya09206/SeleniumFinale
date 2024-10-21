package com.yahya.utility;

public class WebOrderUtil {

    // Create a method to openWebOrderApp

    public static void openWebOrderApp(){

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
    }
}

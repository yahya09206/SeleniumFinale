package com.yahya.pages;

import com.yahya.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WLogin {

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userNameField;
    @FindBy(name = "ctl00$MainContent$password")
    public WebElement passwordField;
    @FindBy(css = "#ctl00_MainContent_login_button")
    public WebElement loginButton;
    @FindBy(xpath = "//span[.='Invalid Login or Password.']")
    public WebElement errorMsg;

    // instruct selenium to start looking for element
    // when this constructor is called
    public WLogin(){
        // initElements accepts 2 args
        // WebDriver instance and Page class instance(this) means current instance of "this" class
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * Method for navigating to actual website
     * accepts no params
     */
    public void goTo(){
        Driver.getDriver().navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?");
    }

    /**
     * Login method
     */
    public void login(String username, String password){

        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    /**
     * Method for checking if the wrong credentials are provided
     * return the result once displayed
     */
    public boolean loginErrorMsg(){

        return this.errorMsg.isDisplayed();
    }
}

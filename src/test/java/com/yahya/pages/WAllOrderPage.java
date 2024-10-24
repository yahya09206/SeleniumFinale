package com.yahya.pages;

import com.yahya.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WAllOrderPage {

    @FindBy(xpath = "//h2[normalize-space(.) = 'List of All Orders']")
    public WebElement header;
    @FindBy(id = "ctl00_MainContent_btnCheckAll")
    public WebElement checkAllButton;
    @FindBy(id = "ctl00_MainContent_btnUncheckAll")
    public WebElement uncheckAllButton;

    public WAllOrderPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
}

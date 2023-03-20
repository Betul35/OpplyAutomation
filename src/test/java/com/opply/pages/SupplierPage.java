package com.opply.pages;

import com.opply.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierPage {

    public SupplierPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/supplier/10']")
    public WebElement supplier10;

    @FindBy(xpath = "//p")
    public WebElement supplier10detail;


}

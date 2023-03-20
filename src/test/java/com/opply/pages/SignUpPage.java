package com.opply.pages;

import com.opply.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public SignUpPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/signup']")
    public WebElement signUpHereButton;

    @FindBy(xpath = "//input[@id='first-name']")
    public WebElement firstNameInputBox;

    @FindBy(xpath = "//input[@id='last-name']")
    public WebElement lastNameInputBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signUpButton;


    @FindBy(xpath = "//h1")
    public  WebElement SupplierTitle;

}

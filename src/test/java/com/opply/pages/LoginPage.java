package com.opply.pages;

import com.opply.utilities.BrowserUtils;
import com.opply.utilities.ConfigurationReader;
import com.opply.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@id='user']")
    public  WebElement userNameInput;

    @FindBy(xpath ="//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button")
    public WebElement loginButton;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutButton;


    //login method with valid credentials
    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        userNameInput.sendKeys("opplypiyade@test.com");
        passwordInput.sendKeys("Opplypiyade1");
        loginButton.click();

    }

}

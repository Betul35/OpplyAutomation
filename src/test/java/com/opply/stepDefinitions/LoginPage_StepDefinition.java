package com.opply.stepDefinitions;

import com.opply.pages.LoginPage;
import com.opply.pages.SignUpPage;
import com.opply.utilities.BrowserUtils;
import com.opply.utilities.ConfigurationReader;
import com.opply.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPage_StepDefinition {

    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();

    @When("user clicks login button")
    public void user_clicks_login_button() {
        if (!loginPage.loginButton.isEnabled()) {
            // throw an exception if button is not clickable
            Assert.fail("Button is not clickable login failed");
        } else {
            // perform click action if button is clickable
            loginPage.loginButton.click();
        }
    }


    @When("user enters the username {string} on login page")
    public void userEntersTheUsernameOnLoginPage(String username) {
        loginPage.userNameInput.sendKeys(username);
    }

    @And("user enters password {string} on login page")
    public void userEntersPasswordOnLoginPage(String password) {
        loginPage.passwordInput.sendKeys(password);
    }

    @Then("user is on the dashboard")
    public void userIsOnTheDashboard(){
       BrowserUtils.waitFor(3);
        String expectedTitle = "Suppliers";
        String actualTitle= signUpPage.SupplierTitle.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
        Driver.closeDriver();
    }


}

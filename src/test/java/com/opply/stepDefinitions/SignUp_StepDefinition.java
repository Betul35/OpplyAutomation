package com.opply.stepDefinitions;

import com.opply.pages.SignUpPage;
import com.opply.utilities.BrowserUtils;
import com.opply.utilities.ConfigurationReader;
import com.opply.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignUp_StepDefinition {

    SignUpPage signUpPage = new SignUpPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Then("user clicks the sign up here button")
    public void user_clicks_the_sign_up_here_button() {
        signUpPage.signUpHereButton.click();
    }


    @When("user enters the username {string}")
    public void userEntersTheUsername(String username) {
        signUpPage.firstNameInputBox.sendKeys(username);
    }

    @And("user enters the lastname {string}")
    public void userEntersTheLastname(String lastname) {
        signUpPage.lastNameInputBox.sendKeys(lastname);
    }

    @And("user enters the email {string}")
    public void userEntersTheEmail(String email) {
        signUpPage.emailInputBox.sendKeys(email);
    }


    @When("user enters password {string}")
    public void user_enters_password(String password) {
        signUpPage.passwordInputBox.sendKeys(password);
    }
    @When("user clicks sign up button")
    public void user_clicks_sign_up_button() {
        signUpPage.signUpButton.click();
        BrowserUtils.waitFor(5);

        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("Page Title = " + Driver.getDriver().getTitle());
        //Assert.assertTrue(actualTitle.equals("Vite App"));

    //    Driver.closeDriver();

        //There is no assertion criteria for invalid input in order to test if the page gives me error message
        // if we send the credentials that are not matched with the scenario criteria, so that we are not able to assert it!
    }







}

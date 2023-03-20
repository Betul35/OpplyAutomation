package com.opply.stepDefinitions;

import com.opply.pages.LoginPage;
import com.opply.utilities.BrowserUtils;
import com.opply.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

public class LogoutPage_StepDefinition {
    LoginPage loginPage=new LoginPage();

    @Given("user is logged in")
    public void user_is_logged_in() {
        loginPage.login();
    }
    @When("user clicks logout button")
    public void user_clicks_logout_button() {

        //the logout button is throwing stale web element because the element is not attached to the DOM
        //therefore throw catch is used
        //to get rid of it and find the new element again
        BrowserUtils.waitFor(3);
        try {
            loginPage.logoutButton.click();
        } catch (StaleElementReferenceException e) {
            // If the StaleElementReferenceException is caught, re-find the element
            loginPage.logoutButton = Driver.getDriver().findElement(By.xpath("//li[@class='nav-item'][4]"));
            loginPage.logoutButton.click();
        }
    }

    @Then("user sees the login page")
    public void user_sees_the_login_page() {
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println(actualTitle);
         Assert.assertTrue(actualTitle.endsWith("login"));
    }


}

package com.opply.stepDefinitions;

import com.opply.pages.SupplierPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Suppliers_StepDefinition {

    SupplierPage supplierPage = new SupplierPage();

    @When("user clicks on a supplier")
    public void user_clicks_on_a_supplier() {
        supplierPage.supplier10.click();
    }

    @Then("user can see details of supplier")
    public void user_can_see_details_of_supplier() {
        String expectedSupplier10Text = "We have the best Oranges in town";
        Assert.assertEquals(expectedSupplier10Text, supplierPage.supplier10detail.getText());

    }


}

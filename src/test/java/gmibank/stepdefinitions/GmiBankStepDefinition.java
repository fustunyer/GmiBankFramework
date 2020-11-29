package gmibank.stepdefinitions;

import cucumber.api.java.en.Given;
import gmibank.utilities.Driver;

public class GmiBankStepDefinition {

    @Given("user go to {string}")
    public void user_go_to(String homepage) {
        Driver.getDriver().get(homepage);

    }
}

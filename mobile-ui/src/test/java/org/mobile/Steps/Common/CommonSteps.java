package org.mobile.Steps.Common;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.mobile.Services.Common.CommonService;

public class CommonSteps {
    //Implements the CommonService class and has the purpose
    //of declaring common steps throughout the automation framework.
    CommonService commonService = new CommonService();

    //For example:
    @Given("Step 1")
    public void impStep1() {commonService.logicStep1();}

    @And("Step 2")
    public void impStep2() {
        commonService.logicStep2();
    }

    @When("Step 3")
    public void impStep3() {
        commonService.logicStep3();
    }

    @Then("Step 4 {string}")
    public void impStep4(String text) {
        commonService.logicStep4(text);
    }

    @When("User performs a 'Back' from the application")
    public void performBackFromTheApplication() {
        commonService.performBackFromTheApplication();
    }
}

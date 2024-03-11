package org.mobile.Steps.GetStarted;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.mobile.Services.GetStartedService.GetStartedService;

public class GetStartedSteps {

    GetStartedService getStartedService = new GetStartedService();

    @Given("User clicks on 'Get started' button")
    public void clickOnGetStarted() {
        getStartedService.clickOnGetStarted();
    }

    @And("'Enter your phone number' screen is displayed")
    public void enterYourPhoneNumberScreenWillBeDisplayed() {
        getStartedService.enterYourPhoneNumberScreenWillBeDisplayed();
    }

    @And("Select {string} in the list of numerical characteristics")
    public void selectCountryNumericalCharacteristics(String country) {
        getStartedService.selectCountryNumericalCharacteristics(country);
    }

    @And("Enter a valid cell phone number for the selected country {string}")
    public void enterValirCellPhoneForSelectedCountry(String cellPhoneNumber) {
        getStartedService.enterValirCellPhoneForSelectedCountry(cellPhoneNumber);
    }

    @When("User click on the 'Continue' button")
    public void clickOnContinueBtn() {
        getStartedService.clickOnContinueBtn();
    }

    @Then("'Enter the 6 digit code' screen is displayed")
    public void enterThe6DigitCodeScreenWillBeDisplayed() {
        getStartedService.enterThe6DigitCodeScreenWillBeDisplayed();
    }

    @And("'Privacy Notice' link is displayed")
    public void privacyNoticeLinkIsDisplayed() {
        getStartedService.privacyNoticeLinkIsDisplayed();
    }

    @When("User click on the 'Privacy Notice' link")
    public void clickOnPrivacyNoticeLink() {
        getStartedService.clickOnPrivacyNoticeLink();
    }

    @Then("'Privacy Notice' screen is displayed")
    public void privacyNoticeScreenIsDisplayed() {
        getStartedService.privacyNoticeScreenIsDisplayed();
    }

    @And("'Terms of Service' link is displayed")
    public void termsOfServiceLinkIsDisplayed() {
        getStartedService.termsOfServiceLinkIsDisplayed();
    }

    @When("User click on the 'Terms of Service' link")
    public void clickOnTermsOfServiceLink() {
        getStartedService.clickOnTermsOfServiceLink();
    }

    @Then("'Terms of Service' screen is displayed")
    public void termsOfServiceScreenIsDisplayed() {
        getStartedService.termsOfServiceScreenIsDisplayed();
    }
}

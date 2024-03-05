package org.mobile.Services.GetStartedService;

import org.core.actions.Actions;
import org.mobile.Helpers.Helper;
import org.mobile.Pages.GetStartedPage.GetStartedPage;

import static org.mobile.Constants.Constants.GetStartedFeature.*;

public class GetStartedService implements Actions {

    GetStartedPage getStartedPage = new GetStartedPage();
    Helper helper = new Helper();

    public void clickOnGetStarted() {
        assertVisible(getStartedPage.btnGetStarted);
        assertEnable(getStartedPage.btnGetStarted);
        click(getStartedPage.btnGetStarted);
    }

    public void enterYourPhoneNumberScreenWillBeDisplayed() {
        Helper.waitElementWithAttempt(getStartedPage.txtEnterYourPhoneNumber, 3, 1);
        assertText(getStartedPage.txtEnterYourPhoneNumber, TXT_ENTER_YOUR_PHONE_NUMBER);
        assertVisible(getStartedPage.txtDescEnterYourPhoneNumber);
        assertText(getStartedPage.txtDescEnterYourPhoneNumber, TXT_DESC_ENTER_YOUR_PHONE_NUMBER);
        assertVisible(getStartedPage.txtPhoneNumber);
        assertText(getStartedPage.txtPhoneNumber, TXT_PHONE_NUMBER);
    }

    public void selectCountryNumericalCharacteristics(String country) {
        click(getStartedPage.spinnerSelectNumericalCharacteristics);
        click(helper.scrollToElementByContainsText(country));
    }

    public void enterValirCellPhoneForSelectedCountry(String cellPhoneNumber) {
        assertVisible(getStartedPage.inpEnterPhoneNumber);
        sendValue(getStartedPage.inpEnterPhoneNumber, cellPhoneNumber);
    }

    public void clickOnContinueBtn() {
        assertVisible(getStartedPage.btnContinue);
        assertEnable(getStartedPage.btnContinue);
        click(getStartedPage.btnContinue);
    }

    public void enterThe6DigitCodeScreenWillBeDisplayed() {
        Helper.waitElementWithAttempt(getStartedPage.btnBack, 3,1);
        assertVisible(getStartedPage.txtEnterTheSixDigitCode);
        assertVisible(getStartedPage.txtDescEnterYourPhoneNumber);
        assertDisable(getStartedPage.btnContinue);
    }
}

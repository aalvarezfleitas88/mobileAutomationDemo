package org.mobile.Services.GetStartedService;

import org.core.actions.Actions;
import org.mobile.Helpers.Helper;
import org.mobile.Pages.Common.CommonPage;
import org.mobile.Pages.GetStartedPage.GetStartedPage;

import static org.mobile.Constants.Constants.GetStartedFeature.*;

public class GetStartedService implements Actions {

    GetStartedPage getStartedPage = new GetStartedPage();
    Helper helper = new Helper();
    CommonPage commonPage = new CommonPage();

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

    public void termsOfServiceLinkIsDisplayed() {
        assertVisible(getStartedPage.lnkTermsOfService);
    }

    public void clickOnTermsOfServiceLink() {
        helper.screenTapingUsingCoordinates(898, 1068);
    }

    public void termsOfServiceScreenIsDisplayed() {
        Helper.waitElementWithAttempt(commonPage.urlFieldChrome, 3,1);
        assertText(commonPage.urlFieldChrome, TXT_URL_TERMS_OF_SERVICE);
    }

    public void privacyNoticeLinkIsDisplayed() {
        assertVisible(getStartedPage.lnkPrivacyNotice);
    }

    public void clickOnPrivacyNoticeLink() {
        helper.screenTapingUsingCoordinates(732, 1144);
    }

    public void privacyNoticeScreenIsDisplayed() {
        Helper.waitElementWithAttempt(commonPage.urlFieldChrome, 3,1);
        assertText(commonPage.urlFieldChrome, TXT_URL_PRIVACY_NOTICE);
    }
}

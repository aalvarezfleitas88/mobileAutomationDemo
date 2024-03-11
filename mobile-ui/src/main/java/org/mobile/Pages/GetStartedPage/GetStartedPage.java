package org.mobile.Pages.GetStartedPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.core.pages.BasePage;

public class GetStartedPage extends BasePage {

    /************************* BUTTONS *****************************/
    @AndroidFindBy(id = "com.hdw.james.rider:id/getStartedButton")
    public MobileElement btnGetStarted;

    @AndroidFindBy(id = "com.hdw.james.rider:id/continueButton")
    public MobileElement btnContinue;

    @AndroidFindBy(accessibility = "Navigate up")
    public MobileElement btnBack;

    /************************* TEXTS *****************************/
    @AndroidFindBy(id = "com.hdw.james.rider:id/title")
    public MobileElement txtEnterYourPhoneNumber;
    public MobileElement txtEnterTheSixDigitCode = txtEnterYourPhoneNumber;

    @AndroidFindBy(id = "com.hdw.james.rider:id/description")
    public MobileElement txtDescEnterYourPhoneNumber;

    @AndroidFindBy(id = "com.hdw.james.rider:id/phoneNumberInputTitle")
    public MobileElement txtPhoneNumber;

    /************************* LINKS *****************************/
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Terms of Service')]")
    public MobileElement lnkTermsOfService;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Privacy')]")
    public MobileElement lnkPrivacyNotice;

    /************************* INPUTS *****************************/
    @AndroidFindBy(id = "com.hdw.james.rider:id/input")
    public MobileElement inpEnterPhoneNumber;

    /************************* OTHERS *****************************/
    @AndroidFindBy(id = "com.hdw.james.rider:id/spinner")
    public MobileElement spinnerSelectNumericalCharacteristics;
}

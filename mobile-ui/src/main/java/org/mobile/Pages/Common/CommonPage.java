package org.mobile.Pages.Common;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import org.core.pages.BasePage;

public class CommonPage extends BasePage {

    //This class handles elements common to all Pages

    //For example -> Button "Continue to"
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Continue')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Continue']"),
            @AndroidBy(accessibility = "Continue")
    })
    public MobileElement btnContinueTo;
}
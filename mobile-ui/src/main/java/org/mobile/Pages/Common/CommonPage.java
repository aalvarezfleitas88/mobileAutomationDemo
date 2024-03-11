package org.mobile.Pages.Common;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.core.pages.BasePage;

public class CommonPage extends BasePage {

    //This class handles elements common to all Pages

    /************************* BUTTONS *****************************/
    //For example -> Button "Continue to"
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Continue')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Continue']"),
            @AndroidBy(accessibility = "Continue")
    })
    public MobileElement btnContinueTo;

    /************************* OTHERS *****************************/
    @AndroidFindBy(id = "org.chromium.webview_shell:id/url_field")
    public MobileElement urlFieldChrome;
}
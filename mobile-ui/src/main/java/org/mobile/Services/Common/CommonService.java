package org.mobile.Services.Common;

import org.core.actions.Actions;
import org.mobile.Pages.Common.CommonPage;

public class CommonService implements Actions {
    //This class is intended to implement business logic for common services.
    //Implements the CommonPage class where the common elements for Pages are located.
    CommonPage commonPage = new CommonPage();

    //For example:
    public void logicStep1() {
        click(commonPage.btnContinueTo);
    }

    public void logicStep2() {
        assertDisable(commonPage.btnContinueTo);
    }

    public void logicStep3() {
        assertDisable(commonPage.btnContinueTo);
    }

    public void logicStep4(String text) {
        assertText(commonPage.btnContinueTo, text);
    }

    public void performBackFromTheApplication() {
        backAndroidApp();
    }
}

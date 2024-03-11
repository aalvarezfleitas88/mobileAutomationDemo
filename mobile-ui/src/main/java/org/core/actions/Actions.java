package org.core.actions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.core.drivers.BaseDriver;
import org.junit.jupiter.api.Assertions;

import static org.apache.commons.lang3.StringUtils.trim;

public interface Actions {

    //This interface contains different functionalities
    //using native Appium functions to be used from the automations.

    default void click(MobileElement element){
        try {
            element.click();
        } catch (Exception e){
            Assertions.fail(e.getMessage(), e);
        }
    }

    default void tapElement(MobileElement mobileElement){
        try {
            TouchAction touchAction = new TouchAction(BaseDriver.getDriver());
            if(mobileElement.isDisplayed()){
                touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(mobileElement))).perform();
            }
        } catch (Exception e){
            Assertions.fail(e.getMessage(), e);
        }
    }

    default void assertVisible(MobileElement mobileElement) {
        boolean successfullCase=false;

        if(mobileElement.isDisplayed()) {
            successfullCase = true;
        }

        try{Assertions.assertTrue(successfullCase);}
        catch (Exception e)
        {
            Assertions.fail(e.getMessage(), e);
        }
    }

    default void assertText(MobileElement mobileElement, String valorTexto) {
        Boolean sucefullCase = false;
        if (trim(mobileElement.getText()).equals(valorTexto)) {sucefullCase = true;}
        try {
            Assertions.assertTrue(sucefullCase);
        } catch (Exception e) {
            Assertions.fail(e.getMessage(), e);
        }
    }

    default void assertDisable(MobileElement mobileElement) {
        boolean successfullCase=true;

        if (mobileElement.isEnabled()) {
            successfullCase = false;
        }

        try{Assertions.assertTrue(successfullCase);}
        catch (Exception e)
        {
            Assertions.fail(e.getMessage(), e);
        }
    }

    default void assertEnable(MobileElement mobileElement) {
        boolean successfullCase=false;

        if (mobileElement.isEnabled()) {
            successfullCase = true;
        }

        try{Assertions.assertTrue(successfullCase);}
        catch (Exception e)
        {
            Assertions.fail(e.getMessage(), e);
        }
    }

    default void assertEqualText( String valorTexto1, String valorTexto2) {
        Boolean successfullCase = false;
        if (trim(valorTexto1).equals(valorTexto2)) {successfullCase = true;}
        try{Assertions.assertTrue(successfullCase);}
        catch (Exception e)
        {
            Assertions.fail(e.getMessage(), e);
        }
    }

    default void sendValue(MobileElement element, String value){
        try {
            element.setValue(value);
        } catch (Exception e){
            Assertions.fail(e.getMessage(), e);
        }
    }

    default void clearElement(MobileElement mobileElement) {
        try {
            mobileElement.clear();
        } catch (Exception e){
            Assertions.fail(e.getMessage(), e);
        }
    }

    default void backAndroidApp() {
        try {
            BaseDriver.getDriver().navigate().back();
        } catch (Exception e) {
            Assertions.fail(e.getMessage(), e);
        }
    }
}

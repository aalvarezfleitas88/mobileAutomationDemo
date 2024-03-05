package org.core.pages;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.core.drivers.BaseDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected static MobileDriver driver = null;
    public BasePage() {
        this.driver = BaseDriver.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}

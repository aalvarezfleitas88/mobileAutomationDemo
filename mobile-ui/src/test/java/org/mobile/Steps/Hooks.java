package org.mobile.Steps;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.*;
import org.core.appium.local.AndroidLocalMobileDriverBuilder;
import org.core.drivers.BaseDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Hooks {

    public static MobileDriver<MobileElement> driver = null;

    @Before
    public void setUp(Scenario scenario) throws Exception {
        switch (System.getProperty("runMode", "LOCAL")){
            case "LOCAL":
                DesiredCapabilities localCapabilities = new AndroidLocalMobileDriverBuilder()
                        .standardBuilder().withPlatformVersion(System.getProperty("osversion", "12"))
                        .getDesiredCapabilites();

                URL url = new URL("http://127.0.0.1:4723/wd/hub");
                driver = new AndroidDriver(url, localCapabilities);
                break;
        }
        BaseDriver.setDriver(driver);
    }
}
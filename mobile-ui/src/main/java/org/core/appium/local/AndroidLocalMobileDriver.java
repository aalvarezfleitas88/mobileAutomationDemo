package org.core.appium.local;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

final class AndroidLocalMobileDriver extends LocalMobileDriver {

    private static AndroidDriver driver;

    AndroidLocalMobileDriver(URL appiumUrl, DesiredCapabilities capabilities) {
        this.driver = new AndroidDriver(appiumUrl, capabilities);
    }

}

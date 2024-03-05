package org.core.appium.local;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

final class IOSLocalMobileDriver extends LocalMobileDriver {

    IOSLocalMobileDriver(URL appiumUrl, DesiredCapabilities capabilities) {
        this.driver = new IOSDriver(appiumUrl, capabilities);
    }

    private IOSDriver driver;


}

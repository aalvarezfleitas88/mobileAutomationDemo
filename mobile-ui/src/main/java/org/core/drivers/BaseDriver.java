package org.core.drivers;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseDriver {
    static ThreadLocal<AppiumDriverLocalService> service = new ThreadLocal<>();
    static ThreadLocal<MobileDriver> driver = new ThreadLocal<>();
    public static MobileDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(MobileDriver mobileDriver) { driver.set(mobileDriver); }

    public static AppiumDriverLocalService getService() {
        return service.get();
    }

    public static void quitDriver(){
        getDriver().quit();
    }
}


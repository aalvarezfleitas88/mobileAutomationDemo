package org.core.appium.local;


import io.appium.java_client.remote.MobileCapabilityType;
import org.core.appium.MobileDriverBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Optional;

abstract class LocalMobileDriverBuilder<T extends LocalMobileDriverBuilder<T>> extends MobileDriverBuilder<T> {

    private Optional<String> deviceName = Optional.empty();
    private Optional<String> platformName = Optional.empty();
    private Optional<String> platformVersion = Optional.empty();
    private Optional<String> automationName = Optional.empty();

    public T withDeviceName(String deviceName) {
        this.deviceName = Optional.of(deviceName);
        return (T)this;
    }

    public T withPlatformName(String platformName) {
        this.platformName = Optional.of(platformName);
        return (T)this;
    }

    public T withPlatformVersion(String platformVersion) {
        this.platformVersion = Optional.of(platformVersion);
        return (T)this;
    }

    public T withAutomationName(String automationName) {
        this.automationName = Optional.of(automationName);
        return (T)this;
    }

    @Override
    protected DesiredCapabilities getDesiredCapabilites() {
        DesiredCapabilities capabilities = super.getDesiredCapabilites();
        this.deviceName.ifPresent((String it) -> capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, it));
        this.platformName.ifPresent((String it) -> capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, it));
        this.platformVersion.ifPresent((String it) -> capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, it));
        this.automationName.ifPresent((String it) -> capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, it));
        return capabilities;
    }
}

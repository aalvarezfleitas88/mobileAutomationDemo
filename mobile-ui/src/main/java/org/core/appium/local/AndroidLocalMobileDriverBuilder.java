package org.core.appium.local;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Optional;

public final class AndroidLocalMobileDriverBuilder extends LocalMobileDriverBuilder<AndroidLocalMobileDriverBuilder> {

    private Optional<String> appPackage = Optional.empty();
    private Optional<String> appActivity = Optional.empty();
    private Optional<String> bundleId = Optional.empty();
    private Optional<Boolean> unicodeKeyboard = Optional.empty();
    private Optional<Boolean> resetKeyboard = Optional.empty();
    private Optional<Boolean> autoGrantPermissions = Optional.empty();

    public AndroidLocalMobileDriverBuilder() {
        this.withPlatformName(MobilePlatform.ANDROID);
        this.withPlatformVersion("12");
        this.withDeviceName("pixel_5");
        this.withAppPackage("com.hdw.james.rider");
        this.withAppActivity(".viewlayer.launcher.LauncherActivity");
        this.withAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
    }

    public AndroidLocalMobileDriverBuilder standardBuilder() {
        return this.enableUnicodeKeyboard()
                .enableResetKeyboard()
                .enableAutoGrantPermissions()
                .disabledWindowAnimation();
    }

    public AndroidLocalMobileDriverBuilder withAppPackage(String appPackage) {
        this.appPackage = Optional.of(appPackage);
        return this;
    }

    public AndroidLocalMobileDriverBuilder withAppActivity(String appActivity) {
        this.appActivity = Optional.of(appActivity);
        return this;
    }

    public AndroidLocalMobileDriverBuilder withBundleId(String bundleId) {
        this.bundleId = Optional.of(bundleId);
        return this;
    }

    public AndroidLocalMobileDriverBuilder enableUnicodeKeyboard() {
        this.unicodeKeyboard = Optional.of(true);
        return this;
    }

    public AndroidLocalMobileDriverBuilder enableResetKeyboard() {
        this.resetKeyboard = Optional.of(true);
        return this;
    }

    public AndroidLocalMobileDriverBuilder enableAutoGrantPermissions() {
        this.autoGrantPermissions = Optional.of(true);
        return this;
    }

    public AndroidLocalMobileDriver build() {
        return new AndroidLocalMobileDriver(this.appiumUrl, getDesiredCapabilites());
    }

    @Override
    public DesiredCapabilities getDesiredCapabilites() {
        DesiredCapabilities capabilities = super.getDesiredCapabilites();
        this.appPackage.ifPresent((String it) -> capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, it));
        this.appActivity.ifPresent((String it) -> capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, it));
        this.bundleId.ifPresent((String it) -> capabilities.setCapability("bundleID", it));
        this.unicodeKeyboard.ifPresent((Boolean it) -> capabilities.setCapability(AndroidMobileCapabilityType.UNICODE_KEYBOARD, it));
        this.resetKeyboard.ifPresent((Boolean it) -> capabilities.setCapability(AndroidMobileCapabilityType.RESET_KEYBOARD, it));
        this.autoGrantPermissions.ifPresent((Boolean it) -> capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, it));
        return capabilities;
    }
}

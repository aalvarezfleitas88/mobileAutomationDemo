package org.core.appium.local;

import io.appium.java_client.remote.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Optional;

public final class IOSLocalMobileDriverBuilder extends LocalMobileDriverBuilder<IOSLocalMobileDriverBuilder> {

    private Optional<String> udid = Optional.empty();
    private Optional<String> xcodeOrgId = Optional.empty();
    private Optional<String> xcodeSigningId = Optional.empty();
    private Optional<Boolean> autoAcceptAlerts = Optional.empty();

    public IOSLocalMobileDriverBuilder() {
        this.withPlatformName(MobilePlatform.IOS);
        this.withPlatformVersion("14.4");
        this.withAutomationName(AutomationName.IOS_XCUI_TEST);
    }

    public IOSLocalMobileDriverBuilder standardBuilder() {
        return this.enableAutoAcceptAlerts();

    }

    public IOSLocalMobileDriverBuilder withUdid(String udid) {
        this.udid = Optional.of(udid);
        return this;
    }

    public IOSLocalMobileDriverBuilder withXcodeOrgId(String xcodeOrgId) {
        this.xcodeOrgId = Optional.of(xcodeOrgId);
        return this;
    }

    public IOSLocalMobileDriverBuilder withXcodeSigningId(String xcodeSigningId) {
        this.xcodeSigningId = Optional.of(xcodeSigningId);
        return this;
    }

    public IOSLocalMobileDriverBuilder enableAutoAcceptAlerts() {
        this.autoAcceptAlerts = Optional.of(true);
        return this;
    }

    public IOSLocalMobileDriver build() {
        return new IOSLocalMobileDriver(this.appiumUrl, getDesiredCapabilites());
    }

    @Override
    public DesiredCapabilities getDesiredCapabilites() {
        DesiredCapabilities capabilities = super.getDesiredCapabilites();
        this.udid.ifPresent((String it) -> capabilities.setCapability(MobileCapabilityType.UDID, it));
        this.xcodeOrgId.ifPresent((String it) -> capabilities.setCapability(IOSMobileCapabilityType.XCODE_ORG_ID, it));
        this.xcodeSigningId.ifPresent((String it) -> capabilities.setCapability(IOSMobileCapabilityType.XCODE_SIGNING_ID, it));
        this.autoAcceptAlerts.ifPresent((Boolean it) -> capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, it));
        return capabilities;
    }
}

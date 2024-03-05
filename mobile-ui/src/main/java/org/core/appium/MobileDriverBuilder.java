package org.core.appium;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public abstract class MobileDriverBuilder<T extends MobileDriverBuilder<T>> {

    protected URL appiumUrl;
    private Optional<Boolean> disabledWindowAnimation = Optional.empty();

    public T withAppiumUrl(URL appiumUrl) {
        this.appiumUrl = appiumUrl;
        return (T)this;
    }

    public T withAppiumUrl(String appiumUrl) throws MalformedURLException {
        return withAppiumUrl(new URL(appiumUrl));
    }

    public T withAppiumUrl(AppiumUrl appiumUrl) {
        return withAppiumUrl(appiumUrl.get());
    }

    public T disabledWindowAnimation() {
        this.disabledWindowAnimation = Optional.of(true);
        return (T)this;
    }

    protected DesiredCapabilities getDesiredCapabilites() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        this.disabledWindowAnimation.ifPresent((Boolean it) -> capabilities.setCapability("disableWindowAnimation", it));
        return capabilities;
    }
}

package org.core.appium;

import java.net.URL;

public class AppiumUrl {
    private URL url;
    AppiumUrl(URL url) {
        this.url = url;
    }
    public URL get() {
        return url;
    }
}

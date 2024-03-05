package org.core.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class AppiumUrlBuilder {

    public static String ENV_APPIUM_URL = "APPIUM_SERVER_URL";
    public static String LOCAL_APPIUM_URL = "http://localhost:4723/wd/hub";

    private Optional<String> protocol = Optional.empty();
    private Optional<String> host = Optional.empty();
    private Optional<String> port = Optional.empty();
    private Optional<String> path = Optional.empty();

    public AppiumUrlBuilder withURL(URL url){
        return withHost(url.getHost())
                .withProtocol(url.getProtocol())
                .withPort(String.valueOf(url.getPort()))
                .withPath(url.getPath());
    }

    public AppiumUrlBuilder withURL(String url) throws MalformedURLException {
        return withURL(new URL(url));
    }

    public AppiumUrlBuilder environmentAppiumURL() throws MalformedURLException {
        return withURL(System.getenv(ENV_APPIUM_URL));
    }

    public AppiumUrlBuilder localAppiumURL() throws MalformedURLException {
        return withURL(LOCAL_APPIUM_URL);
    }

    public AppiumUrlBuilder withProtocol(String protocol) {
        this.protocol = Optional.of(protocol);
        return this;
    }

    public AppiumUrlBuilder withHost(String host) {
        this.host = Optional.of(host);
        return this;
    }

    public AppiumUrlBuilder withPort(String port) {
        this.port = Optional.of(port);
        return this;
    }

    public AppiumUrlBuilder withPath(String path) {
        this.path = Optional.of(path);
        return this;
    }

    public AppiumUrl build() throws Exception {
        URL url = new URL(
                this.protocol.orElse("http"),
                this.host.orElseThrow(() -> new Exception("Undefined appium host")),
                this.port.map(Integer::new).orElseThrow(() -> new Exception("Undefined appium port")),
                this.path.orElse(""));
        return new AppiumUrl(url);
    }
}

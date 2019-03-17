package utils.driver;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class IphoneDriver {

    protected DesiredCapabilities capabilities = new DesiredCapabilities();

    protected static final String APP_FILE_DEVICE = System.getProperty("user.dir") + "/app/beam_device.app";
    protected static final String APP_FILE_SIMULATOR = System.getProperty("user.dir") + "/app/beam_simulator.app";
    protected static final String APPIUM_URL_DEVICE = "http://0.0.0.0:4723/wd/hub";
    protected static final String APPIUM_URL_SIMULATOR = "http://127.0.0.1:4723/wd/hub";
    protected static final String DEVICE_NAME = "deviceName";
    protected static final String PLATFORM_VERSION = "platformVersion";
    protected static final String UDID = "udid";
    protected static final String PLATFORM_NAME = "platformName";
    protected static final String AUTOMATION_NAME = "automationName";
    protected static final String APP = "app";
    protected static final String XCODE_ORIG_ID = "xcodeOrigId";
    protected static final String XCODE_SIGNING_ID = "xcodeSigningId";
    protected static final String NO_RESET = "noReset";
    protected static final String PERMISSIONS = "permissions";
    protected static final String ALLOW_TOUCH_ID_ENROLL = "allowTouchIdEnroll";

    protected void setCommonDesiredCapabilities() {
        capabilities.setCapability(PLATFORM_NAME, "iOS");
        capabilities.setCapability(AUTOMATION_NAME, "Appium");
        capabilities.setCapability(XCODE_ORIG_ID, "7A7F3AW7RP");
        capabilities.setCapability(XCODE_SIGNING_ID, "iPhone Developer");
        capabilities.setCapability(NO_RESET, "true");
    }

    protected abstract void setCustomDesiredCapabilities();

    protected abstract URL getUrl() throws MalformedURLException;

    protected IOSDriver createDriver() throws MalformedURLException {
        setCommonDesiredCapabilities();
        setCustomDesiredCapabilities();
        return new IOSDriver(getUrl(), capabilities);
    }
}

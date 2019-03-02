package utils.driver;

import java.net.MalformedURLException;
import java.net.URL;

public class Iphone8Driver extends IphoneDriver {

    @Override
    protected void setCustomDesiredCapabilities() {
        capabilities.setCapability(DEVICE_NAME, "iPhone 8");
        capabilities.setCapability(PLATFORM_VERSION, "11.4.1");
        capabilities.setCapability(UDID, "47b17fdc57603bd07254cc5932699bf1b1dea368");
        capabilities.setCapability(APP, APP_FILE_DEVICE);
    }

    @Override
    protected URL getUrl() throws MalformedURLException {
        return new URL(APPIUM_URL_DEVICE);
    }
}

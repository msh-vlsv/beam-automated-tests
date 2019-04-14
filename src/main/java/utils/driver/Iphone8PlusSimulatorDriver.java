package utils.driver;

import java.net.MalformedURLException;
import java.net.URL;

public class Iphone8PlusSimulatorDriver extends IphoneDriver {

    @Override
    public void setCustomDesiredCapabilities() {
        capabilities.setCapability(DEVICE_NAME, "iPhone 8 Plus");
        capabilities.setCapability(PLATFORM_VERSION, "12.2");
        capabilities.setCapability(APP, APP_FILE_SIMULATOR);
        capabilities.setCapability(PERMISSIONS, "{\"com.madeawkward.mybeam\": {\"notifications\": \"YES\", " +
                "\"photos\": \"YES\", \"location\": \"always\", \"camera\": \"YES\"}}");
        capabilities.setCapability(ALLOW_TOUCH_ID_ENROLL, true);
    }

    @Override
    public URL getUrl() throws MalformedURLException {
        return new URL(APPIUM_URL_SIMULATOR);
    }
}

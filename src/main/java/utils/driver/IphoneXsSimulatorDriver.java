package utils.driver;

import java.net.MalformedURLException;
import java.net.URL;

public class IphoneXsSimulatorDriver extends IphoneDriver {

    @Override
    protected void setCustomDesiredCapabilities() {
        capabilities.setCapability(DEVICE_NAME, "iPhone XS");
        capabilities.setCapability(PLATFORM_VERSION, "12.1");
        capabilities.setCapability(APP, APP_FILE_SIMULATOR);
        capabilities.setCapability(PERMISSIONS, "{\"com.madeawkward.mybeam\": {\"notifications\": \"YES\", " +
                "\"photos\": \"YES\", \"location\": \"always\", \"camera\": \"YES\"}}");
        capabilities.setCapability(ALLOW_TOUCH_ID_ENROLL, true);
    }

    @Override
    protected URL getUrl() throws MalformedURLException {
        return new URL(APPIUM_URL_SIMULATOR);
    }
}

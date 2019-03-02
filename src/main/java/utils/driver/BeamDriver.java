package utils.driver;

import io.appium.java_client.ios.IOSDriver;
import org.apache.logging.log4j.Logger;
import utils.BeamLogger;

import java.net.MalformedURLException;

public class BeamDriver {

    private Logger logger = BeamLogger.getInstance().getLogger();
    private static BeamDriver instance;

    private IOSDriver driver;

    private BeamDriver() {
        IphoneDriver iphoneDriver = DriverFactory.getDriver(DeviceName.IPHONE_8_PLUS_SIMULATOR);
        try {
            driver = iphoneDriver.createDriver();
        } catch (MalformedURLException e) {
            logger.warn(e);
        }
    }

    public static BeamDriver getInstance() {
        if (instance == null) {
            instance = new BeamDriver();
        }
        return instance;
    }

    public IOSDriver getDriver() {
        return driver;
    }

}

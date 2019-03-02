package utils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.qameta.allure.Step;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import utils.driver.BeamDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static io.appium.java_client.touch.offset.PointOption.point;
import static utils.InputPropertiesConstants.BUNDLE_ID;
import static utils.ParametersLoader.getInputDataProperty;

public class MobileCommands {

    private static IOSDriver driver = BeamDriver.getInstance().getDriver();
    private static Logger logger = BeamLogger.getInstance().getLogger();

    public static void hideKeyboard() {
        logger.info("Hide keyboard");
        TouchAction touchAction = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();
        int x = (int) (size.width * 0.5);
        int y = (int) (size.height * 0.1);
        touchAction.tap(point(x, y)).release().perform();
    }

    public static void terminateApp() {
        logger.info("Terminate app");
        Map<String, Object> params = new HashMap<>();
        params.put("bundleId", getInputDataProperty(BUNDLE_ID));
        driver.executeScript("mobile: terminateApp", params);
    }

    public static void launchApp() {
        logger.info("Launch app");
        Map<String, Object> params = new HashMap<>();
        params.put("bundleId", getInputDataProperty(BUNDLE_ID));
        driver.executeScript("mobile: launchApp", params);
    }

    @Step("Restart app")
    public static void restartApp() {
        terminateApp();
        launchApp();
    }

    @Step("Reinstall app")
    public static void reinstallApp() {
        logger.info("Reinstall app");
        driver.removeApp(getInputDataProperty(BUNDLE_ID));
        driver.launchApp();
    }

    @Step("Run app in background for {seconds} seconds")
    public static void runAppInBackground(int seconds) {
        logger.info("Run app in background for " + seconds + " seconds");
        driver.runAppInBackground(Duration.ofSeconds(seconds));
    }

    public static String getCapability(String capability) {
        return driver.getCapabilities().getCapability(capability).toString();
    }

    public static void setTouchID(boolean enabled) {
        driver.toggleTouchIDEnrollment(enabled);
    }

    public static void performTouchId(boolean match) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            logger.warn("Interrupted!", e);
            Thread.currentThread().interrupt();
        }
        if (match) {
            logger.info("Valid Touch ID");
            driver.performTouchID(true);
        } else {
            logger.info("Invalid Touch ID");
            driver.performTouchID(false);
        }
    }


}

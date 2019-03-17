package utils;

import io.appium.java_client.ios.IOSDriver;
import io.qameta.allure.Attachment;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.OutputType;
import utils.driver.BeamDriver;

public class TestWatcher implements BeforeEachCallback, AfterEachCallback {

    private IOSDriver driver = BeamDriver.getInstance().getDriver();

    private Logger logger = BeamLogger.getInstance().getLogger();

    @Override
    public void beforeEach(ExtensionContext extensionContext) {
        logger.info("*** " + extensionContext.getDisplayName() + " is started ***");
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) {
        boolean isTestFailed = extensionContext.getExecutionException().isPresent();
        String testName = extensionContext.getDisplayName();
        if (isTestFailed) {
            logger.info("*** " + testName + " is failed ***");
            logger.info("***");
        } else {
            logger.info("*** " + testName + " is passed successfully ***");
            logger.info("***");
        }
        appendScreenshotToAllure();
    }

    @Attachment(value = "Screenshot", type = "image/png")
    private byte[] appendScreenshotToAllure() {
        return driver.getScreenshotAs(OutputType.BYTES);
    }

}

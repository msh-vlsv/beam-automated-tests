package ui.common.elements;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BeamLogger;
import utils.driver.BeamDriver;

import java.util.Collections;
import java.util.List;

public abstract class BaseElement {

    protected static final long DEFAULT_TIMEOUT = 10;

    private IOSDriver driver = BeamDriver.getInstance().getDriver();
    private Logger logger = BeamLogger.getInstance().getLogger();

    private String name;
    private By byLocator;

    public BaseElement(LocatorType locatorType, String locator, String name) {
        this.name = name;
        this.byLocator = getByLocator(locatorType, locator);
    }

    private By getByLocator(LocatorType locatorType, String locator) {
        switch (locatorType) {
            case IOS_NS_PREDICATE:
                return MobileBy.iOSNsPredicateString(locator);
            case IOS_CLASS_CHAIN:
                return MobileBy.iOSClassChain(locator);
            case ID:
                return MobileBy.AccessibilityId(locator);
            case XPATH:
                return MobileBy.xpath(locator);
            default:
                throw new IllegalArgumentException("Unknown locator type " + locatorType.toString());
        }
    }

    public WebElement waitForElement() {
        return waitForElement(DEFAULT_TIMEOUT);
    }

    public WebElement waitForElement(long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
        } catch (TimeoutException e1) {
            logger.warn(getErrorMessage());
            return null;
        }
    }

    public List<WebElement> waitForElements() {
        return waitForElements(DEFAULT_TIMEOUT);
    }

    public List<WebElement> waitForElements(long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        try {
            return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byLocator));
        } catch (TimeoutException e1) {
            logger.warn(getErrorMessage());
            return Collections.emptyList();
        }
    }

    public boolean waitForElementDisappearance() {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        try {
            return wait.until(ExpectedConditions.invisibilityOfElementLocated(byLocator));
        } catch (TimeoutException e1) {
            logger.warn(getErrorMessage());
            return true;
        }
    }

    private String getErrorMessage() {
            return getName() + " not found: " + byLocator.toString();
    }

    public String getName() {
        return name;
    }

    public boolean isElementVisible() {
        return waitForElement() != null;
    }

    public boolean isElementVisible(int timeout) {
        return waitForElement(timeout) != null;
    }

    public String getAttributeLabel() {
        return waitForElement().getAttribute("label");
    }


}

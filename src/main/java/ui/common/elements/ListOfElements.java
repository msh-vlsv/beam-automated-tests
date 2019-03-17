package ui.common.elements;

import io.appium.java_client.ios.IOSDriver;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BeamLogger;
import utils.driver.BeamDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfElements extends BaseElement {

    private IOSDriver driver = BeamDriver.getInstance().getDriver();
    private Logger logger = BeamLogger.getInstance().getLogger();

    public ListOfElements(LocatorType locatorType, String locator, String name) {
        super(locatorType, locator, name);
    }

    public List<WebElement> waitForElements() {
        return waitForElements(DEFAULT_TIMEOUT);
    }

    public List<WebElement> waitForElements(long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        try {
            return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(getByLocator()));
        } catch (TimeoutException e1) {
            logger.warn(getErrorMessage());
            return Collections.emptyList();
        }
    }

    public ArrayList<String> getLabels() {
        List<WebElement> elements = waitForElements();
        ArrayList<String> labels = new ArrayList<>();
        for (WebElement element : elements) {
            labels.add(element.getAttribute("label"));
        }
        return labels;
    }
}

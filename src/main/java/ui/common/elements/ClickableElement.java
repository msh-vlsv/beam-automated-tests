package ui.common.elements;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.ElementOption;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import utils.BeamLogger;
import utils.driver.BeamDriver;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class ClickableElement extends BaseElement {

    private IOSDriver driver = BeamDriver.getInstance().getDriver();
    private Logger logger = BeamLogger.getInstance().getLogger();

    public ClickableElement(LocatorType locatorType, String locator, String name) {super(locatorType, locator, name);}

    public void click() {
        logger.info("Click " + getName());
        WebElement element = waitForElement();
        element.click();
    }

    public void dragAndDrop(ClickableElement toElement) {
        logger.info("Drag " + getName() + " to " + toElement.getName() + " and drop it");
        TouchAction touchAction = new TouchAction(driver);
        ElementOption start = element(this.waitForElement());
        ElementOption end = element(toElement.waitForElement());
        touchAction
                .longPress(longPressOptions().withElement(start).withDuration(ofSeconds(7)))
                .moveTo(end)
                .release()
                .perform();

    }



}

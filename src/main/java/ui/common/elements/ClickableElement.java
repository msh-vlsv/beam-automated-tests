package ui.common.elements;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import utils.BeamLogger;

public class ClickableElement extends BaseElement {

    private Logger logger = BeamLogger.getInstance().getLogger();

    public ClickableElement(LocatorType locatorType, String locator, String name) {super(locatorType, locator, name);}

    public void click() {
        logger.info("Click " + getName());
        WebElement element = waitForElement();
        element.click();
    }

    public void selectElement(WebElement element) {
        logger.info("Select " + getName());
        element.click();
    }

}

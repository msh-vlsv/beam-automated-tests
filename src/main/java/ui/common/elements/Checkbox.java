package ui.common.elements;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import utils.BeamLogger;

public class Checkbox extends ClickableElement {

    private Logger logger = BeamLogger.getInstance().getLogger();

    public Checkbox(LocatorType locatorType, String locator, String name) {
        super(locatorType, locator, name);
    }

    public boolean isCheckboxSelected() {
        WebElement element = waitForElement();
        return element.getAttribute("value") != null;
    }

    public void selectCheckbox() {
        logger.info("Select " + getName());
        if (!isCheckboxSelected()) {
            WebElement element = waitForElement();
            element.click();
        }
    }

    public void deselectCheckbox() {
        logger.info("Deselect " + getName());
        if (isCheckboxSelected()) {
            WebElement element = waitForElement();
            element.click();
        }
    }
}

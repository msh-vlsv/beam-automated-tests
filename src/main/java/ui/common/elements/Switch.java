package ui.common.elements;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import utils.BeamLogger;

public class Switch extends ClickableElement {

    private Logger logger = BeamLogger.getInstance().getLogger();

    public Switch(LocatorType locatorType, String locator, String name) {
        super(locatorType, locator, name);
    }

    public boolean isSwitchStateOn() {
        WebElement element = waitForElement();
        return element.getAttribute("value").equals("1");
    }

    public void toggleSwitch() {
        logger.info("Toggle " + getName());
            WebElement element = waitForElement();
            element.click();
    }
}

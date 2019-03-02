package ui.common.elements;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import utils.BeamLogger;

public class EditableTextField extends NonEditableTextField {

    private Logger logger = BeamLogger.getInstance().getLogger();

    public EditableTextField(LocatorType locatorType, String locator, String name) {
        super(locatorType, locator, name);
    }

    public void clear() {
        logger.info("Clear " + getName());
        WebElement element = waitForElement();
        element.clear();
    }

    public void type(String text) {
        logger.info("Fill " + getName() + " with value " + "\"" + text + "\"");
        WebElement element = waitForElement();
        element.sendKeys(text);
    }

    public void clearAndType(String text) {
        clear();
        type(text);
    }

}

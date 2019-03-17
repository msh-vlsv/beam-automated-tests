package ui.common.elements;

import org.openqa.selenium.WebElement;

public class Text extends ClickableElement {

    public Text(LocatorType locatorType, String locator, String name) {
        super(locatorType, locator, name);
    }

    public String getText() {
        WebElement element = waitForElement();
        return element.getText();
    }

}

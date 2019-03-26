package ui.appviews.login.elements;

import ui.common.elements.LocatorType;
import ui.common.elements.TextField;

public class UsernameField extends TextField {

    private static final String XPATH = "//XCUIElementTypeOther[@name='username:']/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField";
    private static final String NAME = "Username field";

    public UsernameField() {
        super(LocatorType.XPATH, XPATH, NAME);
    }
}

package ui.appviews.login.elements;

import ui.common.elements.LocatorType;
import ui.common.elements.TextField;

public class PasswordField extends TextField {

    private static final String XPATH = "//XCUIElementTypeOther[@name='password:']/following-sibling::XCUIElementTypeOther/XCUIElementTypeSecureTextField";
    private static final String NAME = "Password field";

    public PasswordField() {
        super(LocatorType.XPATH, XPATH, NAME);
    }
}

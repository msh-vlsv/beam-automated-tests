package ui.appviews.login.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class LoginButton extends ClickableElement {

    private static final String NS_PREDICATE = "type == 'XCUIElementTypeButton' AND name == 'log in'";
    private static final String NAME = "Log in button";

    public LoginButton() {
        super(LocatorType.IOS_NS_PREDICATE, NS_PREDICATE, NAME);
    }
}

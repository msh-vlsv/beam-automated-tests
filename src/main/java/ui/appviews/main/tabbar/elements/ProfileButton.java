package ui.appviews.main.tabbar.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class ProfileButton extends ClickableElement {

    private static final String NS_PREDICATE = "type == 'XCUIElementTypeButton' AND name == 'Profile'";
    private static final String NAME = "Profile button";

    public ProfileButton() {
        super(LocatorType.IOS_NS_PREDICATE, NS_PREDICATE, NAME);
    }
}

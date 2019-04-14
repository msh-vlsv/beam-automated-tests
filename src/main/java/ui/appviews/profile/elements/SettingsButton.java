package ui.appviews.profile.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class SettingsButton extends ClickableElement {

    private static final String CLASS_CHAIN = "**/XCUIElementTypeNavigationBar/XCUIElementTypeButton";
    private static final String NAME = "Settings button";

    public SettingsButton() {
        super(LocatorType.IOS_CLASS_CHAIN, CLASS_CHAIN, NAME);
    }
}

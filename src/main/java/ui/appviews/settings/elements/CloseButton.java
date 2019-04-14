package ui.appviews.settings.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class CloseButton extends ClickableElement {

    private static final String CLASS_CHAIN = "**/XCUIElementTypeNavigationBar[`name == 'Settings'`]/XCUIElementTypeButton";
    private static final String NAME = "Close button";

    public CloseButton() {
        super(LocatorType.IOS_CLASS_CHAIN, CLASS_CHAIN, NAME);
    }
}

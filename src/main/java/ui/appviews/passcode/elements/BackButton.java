package ui.appviews.passcode.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class BackButton extends ClickableElement {

    private static final String CLASS_CHAIN = "**/XCUIElementTypeNavigationBar[`name == 'Passcode'`]/XCUIElementTypeButton";
    private static final String NAME = "Back button";

    public BackButton() {
        super(LocatorType.IOS_CLASS_CHAIN, CLASS_CHAIN, NAME);
    }
}

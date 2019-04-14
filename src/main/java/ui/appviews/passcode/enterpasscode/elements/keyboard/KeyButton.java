package ui.appviews.passcode.enterpasscode.elements.keyboard;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class KeyButton extends ClickableElement {

    private static final String XPATH = "%s/XCUIElementTypeOther[%d]/XCUIElementTypeOther[%d]";
    private static final String NAME = "Key %s";

    public KeyButton(String base, int row, int column, String name) {
        super(LocatorType.XPATH, String.format(XPATH, base, row, column), String.format(NAME, name));
    }


}

package ui.appviews.settings.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class PasscodeButton extends ClickableElement {

    private static final String ID = "Passcode";
    private static final String NAME = "Passcode button";

    public PasscodeButton() {
        super(LocatorType.ID, ID, NAME);
    }
}

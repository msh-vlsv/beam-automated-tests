package ui.appviews.passcode.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class RequirePasscodeButton extends ClickableElement {

    private static final String ID = "Require passcode";
    private static final String NAME = "Require passcode button";

    public RequirePasscodeButton() {
        super(LocatorType.ID, ID, NAME);
    }
}

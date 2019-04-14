package ui.appviews.passcode.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class ChangePasscodeButton extends ClickableElement {

    private static final String ID = "Change passcode";
    private static final String NAME = "Change passcode button";

    public ChangePasscodeButton() {
        super(LocatorType.ID, ID, NAME);
    }
}

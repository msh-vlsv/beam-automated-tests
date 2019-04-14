package ui.appviews.passcode.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class SettingsButton extends ClickableElement {

    private static final String ID = "Settings";
    private static final String NAME = "Settings button";

    public SettingsButton() {
        super(LocatorType.ID, ID, NAME);
    }
}

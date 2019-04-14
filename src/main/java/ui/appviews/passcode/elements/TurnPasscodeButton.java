package ui.appviews.passcode.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class TurnPasscodeButton extends ClickableElement {

    private static final String ID = "Turn passcode %s";
    private static final String NAME = "Turn passcode %s button";

    public TurnPasscodeButton(String state) {
        super(LocatorType.ID, String.format(ID, state), String.format(NAME, state));
    }
}

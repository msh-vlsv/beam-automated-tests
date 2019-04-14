package ui.appviews.passcode.enterpasscode.elements;

import ui.common.elements.LocatorType;
import ui.common.elements.TextField;

public class ReenterPasscodeField extends TextField {

    private static final String ID = "Re-enter your passcode";
    private static final String NAME = "Re-enter passcode field";

    public ReenterPasscodeField() {
        super(LocatorType.ID, ID, NAME);
    }
}

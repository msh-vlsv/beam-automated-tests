package ui.appviews.passcode.enterpasscode.elements;

import ui.common.elements.LocatorType;
import ui.common.elements.TextField;

public class EnterPasscodeField extends TextField {

    private static final String ID = "Enter a passcode";
    private static final String NAME = "Enter passcode field";

    public EnterPasscodeField() {
        super(LocatorType.ID, ID, NAME);
    }
}

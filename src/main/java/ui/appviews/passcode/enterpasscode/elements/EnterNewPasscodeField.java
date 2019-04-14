package ui.appviews.passcode.enterpasscode.elements;

import ui.common.elements.LocatorType;
import ui.common.elements.TextField;

public class EnterNewPasscodeField extends TextField {

    private static final String ID = "Enter your new passcode";
    private static final String NAME = "Enter new passcode field";

    public EnterNewPasscodeField() {
        super(LocatorType.ID, ID, NAME);
    }
}

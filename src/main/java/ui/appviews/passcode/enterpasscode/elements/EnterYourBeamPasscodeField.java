package ui.appviews.passcode.enterpasscode.elements;

import ui.common.elements.LocatorType;
import ui.common.elements.TextField;

public class EnterYourBeamPasscodeField extends TextField {

    private static final String ID = "Enter your Beam passcode";
    private static final String NAME = "Enter your Beam passcode field";

    public EnterYourBeamPasscodeField() {
        super(LocatorType.ID, ID, NAME);
    }
}

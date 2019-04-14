package ui.appviews.passcode.enterpasscode;

import ui.appviews.passcode.enterpasscode.elements.*;
import ui.appviews.passcode.enterpasscode.elements.keyboard.Keyboard;
import ui.common.views.BaseView;

public class EnterPasscodeView extends BaseView {

    private static final String NAME = "Enter Passcode view";

    private EnterPasscodeField enterPasscodeField = new EnterPasscodeField();
    private ReenterPasscodeField reenterPasscodeField = new ReenterPasscodeField();
    private EnterYourBeamPasscodeField enterYourBeamPasscodeField = new EnterYourBeamPasscodeField();
    private EnterNewPasscodeField enterNewPasscodeField = new EnterNewPasscodeField();
    private Keyboard keyboard = new Keyboard();

    public EnterPasscodeView() {
        super(new Title(), NAME);
    }

    public EnterPasscodeField getEnterPasscodeField() {
        return enterPasscodeField;
    }

    public ReenterPasscodeField getReenterPasscodeField() {
        return reenterPasscodeField;
    }

    public EnterYourBeamPasscodeField getEnterYourBeamPasscodeField() {
        return enterYourBeamPasscodeField;
    }

    public EnterNewPasscodeField getEnterNewPasscodeField() {
        return enterNewPasscodeField;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
}

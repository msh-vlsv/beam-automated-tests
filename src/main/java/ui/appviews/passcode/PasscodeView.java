package ui.appviews.passcode;

import ui.appviews.passcode.elements.BackButton;
import ui.appviews.passcode.elements.ChangePasscodeButton;
import ui.appviews.passcode.elements.Title;
import ui.appviews.passcode.elements.TurnPasscodeButton;
import ui.common.views.BaseView;

public class PasscodeView extends BaseView {

    private static final String NAME = "Passcode view";

    private ChangePasscodeButton changePasscodeButton = new ChangePasscodeButton();
    private BackButton backButton = new BackButton();

    public PasscodeView() {
        super(new Title(), NAME);
    }

    public TurnPasscodeButton getTurnPasscodeButton(String state) {
        return new TurnPasscodeButton(state);
    }

    public ChangePasscodeButton getChangePasscodeButton() {
        return changePasscodeButton;
    }

    public BackButton getBackButton() {
        return backButton;
    }
}

package appmanager;

import ui.appviews.passcode.PasscodeView;
import ui.appviews.passcode.enterpasscode.EnterPasscodeView;

public class PasscodeHelper {

    private PasscodeView passcodeView = new PasscodeView();
    private EnterPasscodeView enterPasscodeView = new EnterPasscodeView();

    public boolean isPasscodeViewVisible() {
        return passcodeView.isViewVisible();
    }

    public void clickBackButton() {
        passcodeView.getBackButton().click();
    }

    public void clickTurnOnPasscodeButton() {
        passcodeView.getTurnPasscodeButton("on").click();
    }

    public void clickTurnOffPasscodeButton() {
        passcodeView.getTurnPasscodeButton("off").click();
    }

    public void typePasscode(String passcode) {
        int count = passcode.length();
        for (int i = 0; i < count; i++) {
            enterPasscodeView.getKeyboard().getKey(passcode.charAt(i)).click();
        }
    }

    public boolean isEnterPasscodeFieldVisible() {
        return enterPasscodeView.getEnterPasscodeField().isElementVisible();
    }

    public boolean isReenterPasscodeFieldVisible() {
        return enterPasscodeView.getReenterPasscodeField().isElementVisible();
    }

    public boolean isEnterYourBeamPasscodeFieldVisible() {
        return enterPasscodeView.getEnterYourBeamPasscodeField().isElementVisible();
    }

    public boolean isEnterNewPasscodeFieldVisible() {
        return enterPasscodeView.getEnterNewPasscodeField().isElementVisible();
    }

}

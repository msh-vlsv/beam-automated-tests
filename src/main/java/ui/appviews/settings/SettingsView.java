package ui.appviews.settings;

import ui.appviews.settings.elements.CloseButton;
import ui.appviews.settings.elements.PasscodeButton;
import ui.common.views.ScrollView;

public class SettingsView extends ScrollView {

    private static final String NAME = "Settings view";

    private CloseButton closeButton = new CloseButton();
    private PasscodeButton passcodeButton = new PasscodeButton();

    public SettingsView() {
        super(new CloseButton(), NAME);
    }

    public CloseButton getCloseButton() {
        return closeButton;
    }

    public PasscodeButton getPasscodeButton() {
        return passcodeButton;
    }
}

package appmanager;

import ui.appviews.settings.SettingsView;

public class SettingsHelper extends HelperBase {

    private SettingsView settingsView = new SettingsView();

    public void clickCloseButton() {
        settingsView.getCloseButton().click();
    }

    public void clickPasscodeButton() {
        settingsView.getPasscodeButton().click();
    }

}

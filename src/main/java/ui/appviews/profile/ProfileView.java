package ui.appviews.profile;

import ui.appviews.profile.elements.SettingsButton;
import ui.appviews.profile.elements.Username;
import ui.common.views.BaseView;

public class ProfileView extends BaseView {

    private static final String NAME = "Profile View";

    private Username username = new Username();
    private SettingsButton settingsButton = new SettingsButton();

    public ProfileView() {
        super(new Username(), NAME);
    }

    public Username getUsername() {
        return username;
    }

    public SettingsButton getSettingsButton() {
        return settingsButton;
    }
}

package ui.appviews.profile;

import ui.appviews.profile.elements.Username;
import ui.common.views.BaseView;

public class ProfileView extends BaseView {

    private static final String NAME = "Profile View";

    private Username username = new Username();

    public ProfileView() {
        super(new Username(), NAME);
    }

    public Username getUsername() {
        return username;
    }
}

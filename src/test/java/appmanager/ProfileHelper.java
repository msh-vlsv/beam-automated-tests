package appmanager;

import ui.appviews.profile.ProfileView;

public class ProfileHelper extends HelperBase {

    private ProfileView profileView = new ProfileView();

    public String getUsername() {
        return profileView.getUsername().getText();
    }
}

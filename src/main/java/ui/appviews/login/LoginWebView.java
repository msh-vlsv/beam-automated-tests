package ui.appviews.login;

import ui.appviews.login.elements.*;
import ui.common.views.ScrollView;

public class LoginWebView extends ScrollView {

    private static final String NAME = "Login web view";

    private UsernameField usernameField = new UsernameField();
    private PasswordField passwordField = new PasswordField();
    private RememberMeCheckbox rememberMeCheckbox = new RememberMeCheckbox();
    private LoginButton loginButton = new LoginButton();
    private AllowButton allowButton = new AllowButton();

    public LoginWebView() {
        super(new LoginButton(), NAME);
    }

    public UsernameField getUsernameField() {
        return usernameField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public RememberMeCheckbox getRememberMeCheckbox() {
        return rememberMeCheckbox;
    }

    public LoginButton getLoginButton() {
        return loginButton;
    }

    public AllowButton getAllowButton() {
        return allowButton;
    }
}

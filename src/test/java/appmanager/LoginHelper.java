package appmanager;

import ui.appviews.login.LoginWebView;
import ui.appviews.login.elements.AllowButton;

public class LoginHelper extends HelperBase {

    private LoginWebView loginWebView = new LoginWebView();

    public boolean isLoginWebViewVisible() {
        return loginWebView.isViewVisible();
    }

    public void typeUsername(String username) {
        loginWebView.getUsernameField().type(username);
    }

    public void typePassword(String password) {
        loginWebView.getPasswordField().type(password);
    }

    public void selectRememberMeCheckbox() {
        loginWebView.getRememberMeCheckbox().click();
    }

    public void clickLoginButton() {
        loginWebView.getLoginButton().click();
    }

    public void clickAllowButton() {
        AllowButton allowButton = loginWebView.getAllowButton();
        loginWebView.scrollDownToElement(allowButton);
        allowButton.click();
    }

    public void login(String username, String password) {
        typeUsername(username);
        typePassword(password);
        selectRememberMeCheckbox();
        clickLoginButton();
        clickAllowButton();
        clickAllowButton();
    }

}

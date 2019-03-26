package autotests.authorized;

import autotests.common.preconditions.WelcomePrecondition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.InputPropertiesConstants.LOGIN;
import static utils.InputPropertiesConstants.PASSWORD;
import static utils.ParametersLoader.getInputDataProperty;

public class LoginTest extends WelcomePrecondition {

    private static final String USERNAME = getInputDataProperty(LOGIN);
    private static final String PASS = getInputDataProperty(PASSWORD);

    @Test
    @Tag("login")
    @DisplayName("Test login")
    @Order(1)
    public void testLogin() {
        APP_MANAGER.getWelcomeHelper().clickConnectRedditAccountButton();
        assertTrue(APP_MANAGER.getLoginHelper().isLoginWebViewVisible(), "Login web view is visible");
        APP_MANAGER.getLoginHelper().login(USERNAME, PASS);
        assertTrue(APP_MANAGER.getSubredditsHelper().isSubredditsViewVisible(), "Subreddits view is visible");
        APP_MANAGER.getMainHelper().clickProfileButton();
        assertEquals(USERNAME, APP_MANAGER.getProfileHelper().getUsername(), "Username is correct");
    }
}

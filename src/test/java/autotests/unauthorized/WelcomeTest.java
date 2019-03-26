package autotests.unauthorized;

import autotests.common.preconditions.WelcomePrecondition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static utils.MobileCommands.restartApp;

public class WelcomeTest extends WelcomePrecondition {

    private static final String HEADLINE = "Welcome to Beam 2";
    private static final String MESSAGE = "Explore reddit in the best possible way.\nConnect your reddit account, or start exploring without account.";

    @Test
    @Tag("welcome")
    @DisplayName("Test are headline and message correct")
    @Order(0)
    public void testAreHeadlineAndMessageCorrect() {
        assertEquals(HEADLINE, APP_MANAGER.getWelcomeHelper().getLandingPageHeadline(), "Headline is correct");
        assertEquals(MESSAGE, APP_MANAGER.getWelcomeHelper().getLandingPageMessage(), "Message is correct");
    }

    @Test
    @Tag("welcome")
    @DisplayName("Test is Welcome page displayed only once")
    @Order(1)
    public void testIsLandingPageDisplayedOnlyOnce() {
        restartApp();
        assertFalse(APP_MANAGER.getWelcomeHelper().isLandingPageVisible(), "Landing page is displayed second time");
    }
}

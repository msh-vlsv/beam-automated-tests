package autotests.common.preconditions;

import autotests.common.TestBase;
import org.junit.jupiter.api.BeforeEach;

import static utils.MobileCommands.reinstallApp;

public class WelcomePrecondition extends TestBase {

    @BeforeEach
    public void openWelcomeView() {
        if (!APP_MANAGER.getWelcomeHelper().isLandingPageVisible()) {
            reinstallApp();
        }
    }
}

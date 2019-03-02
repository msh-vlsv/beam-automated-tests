package autotests.common.preconditions;

import autotests.common.TestBase;
import org.junit.jupiter.api.BeforeEach;

import static utils.MobileCommands.restartApp;

public class UnauthorizedMainPrecondition extends TestBase {

    @BeforeEach
    public void setPrecondition() {
        if (!APP_MANAGER.getMainHelper().isMainViewVisible()) {
            restartApp();
            if (!APP_MANAGER.getMainHelper().isMainViewVisible()) {
                restartApp();
                APP_MANAGER.getWelcomeHelper().clickExploreWithoutAccountButton();
            }
        }
    }
}

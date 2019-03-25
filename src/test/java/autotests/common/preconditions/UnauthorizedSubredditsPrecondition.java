package autotests.common.preconditions;

import org.junit.jupiter.api.BeforeEach;

import static utils.MobileCommands.restartApp;

public class UnauthorizedSubredditsPrecondition extends UnauthorizedMainPrecondition {

    @BeforeEach
    public void openSubredditsView() {
        if (!APP_MANAGER.getSubredditsHelper().isSubredditsViewVisible()) {
            restartApp();
        } else {
            APP_MANAGER.getMainHelper().clickSubredditsButton();
        }
    }
}

package autotests.unauthorized;

import autotests.common.preconditions.UnauthorizedSubredditsPrecondition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static utils.MobileCommands.runAppInBackground;

public class PasscodeTest extends UnauthorizedSubredditsPrecondition {

    private static final String VALID_PASSCODE = "1638";
    private static final String INVALID_PASSCODE = "1111";

    @Test
    @Tag("passcode")
    @DisplayName("Test is passcode set correctly")
    public void testEnablePasscode() {
        APP_MANAGER.getMainHelper().clickProfileButton();
        APP_MANAGER.getProfileHelper().clickSettingsButton();
        APP_MANAGER.getSettingsHelper().clickPasscodeButton();
        APP_MANAGER.getPasscodeHelper().clickTurnOnPasscodeButton();
        assertTrue(APP_MANAGER.getPasscodeHelper().isEnterPasscodeFieldVisible(), "Enter a passcode field is visible");
        APP_MANAGER.getPasscodeHelper().typePasscode(VALID_PASSCODE);
        assertTrue(APP_MANAGER.getPasscodeHelper().isReenterPasscodeFieldVisible(), "Re-enter your passcode field is visible");
        APP_MANAGER.getPasscodeHelper().typePasscode(VALID_PASSCODE);
        runAppInBackground(2);
        assertTrue(APP_MANAGER.getPasscodeHelper().isEnterYourBeamPasscodeFieldVisible(), "Enter your Beam passcode field is visible");
        APP_MANAGER.getPasscodeHelper().typePasscode(VALID_PASSCODE);
        assertTrue(APP_MANAGER.getPasscodeHelper().isPasscodeViewVisible(), "Passcode view is visible");
        APP_MANAGER.getPasscodeHelper().clickTurnOffPasscodeButton();
        APP_MANAGER.getPasscodeHelper().typePasscode(VALID_PASSCODE);
        APP_MANAGER.getPasscodeHelper().clickBackButton();
        APP_MANAGER.getSettingsHelper().clickCloseButton();
        APP_MANAGER.getMainHelper().clickSubredditsButton();
    }

}

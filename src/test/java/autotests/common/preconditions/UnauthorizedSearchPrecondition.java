package autotests.common.preconditions;

import org.junit.jupiter.api.BeforeEach;

public class UnauthorizedSearchPrecondition extends UnauthorizedMainPrecondition {

    @BeforeEach
    public void openSearchView() {
        APP_MANAGER.getMainHelper().clickSearchButton();
    }
}

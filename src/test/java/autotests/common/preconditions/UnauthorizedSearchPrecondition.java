package autotests.common.preconditions;

import org.junit.jupiter.api.BeforeEach;

public class UnauthorizedSearchPrecondition extends UnauthorizedMainPrecondition {

    @BeforeEach
    public void openSearchView() {
        if (!APP_MANAGER.getSearchHelper().isSearchViewVisible()) {
            APP_MANAGER.getMainHelper().clickSearchButton();
        }
    }
}

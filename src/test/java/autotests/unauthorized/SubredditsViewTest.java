package autotests.unauthorized;

import autotests.common.preconditions.UnauthorizedMainPrecondition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubredditsViewTest extends UnauthorizedMainPrecondition {

    @Test
    @Tag("subreddits")
    @DisplayName("Test adding subreddits to favorites")
    @Order(0)
    public void testAddingSubredditsToFavorites() {
        APP_MANAGER.getSubredditsHelper().clickEditButton();
        APP_MANAGER.getSubredditsHelper().addSubredditsToFavorites();
        APP_MANAGER.getSubredditsHelper().scrollPageToTheBeginning();
        assertTrue(APP_MANAGER.getSubredditsHelper().areSubredditsAddedToFavorites(), "Subreddits are added to favorites");
        APP_MANAGER.getSubredditsHelper().clickDoneButton();
    }

    @Test
    @Tag("subreddits")
    @DisplayName("Test removing subreddits from favorites")
    @Order(1)
    public void testRemovingSubredditsFromFavorites() {
        APP_MANAGER.getSubredditsHelper().clickEditButton();
        APP_MANAGER.getSubredditsHelper().removeSubredditsFromFavorites();
        assertTrue(APP_MANAGER.getSubredditsHelper().areSubredditsRemovedFromFavorites(), "Subreddits are removed from favorites");
        APP_MANAGER.getSubredditsHelper().clickDoneButton();
        APP_MANAGER.getSubredditsHelper().scrollPageToTheBeginning();
    }
}

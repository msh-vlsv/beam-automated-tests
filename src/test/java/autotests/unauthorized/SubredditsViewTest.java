package autotests.unauthorized;

import autotests.argumentsprovider.SubredditsViewArgumentsProvider;
import autotests.common.preconditions.UnauthorizedSubredditsPrecondition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SubredditsViewTest extends UnauthorizedSubredditsPrecondition {

    @ParameterizedTest
    @ArgumentsSource(SubredditsViewArgumentsProvider.class)
    @Tag("subreddits")
    @DisplayName("Test adding subreddits to favorites")
    @Order(1)
    public void testAddingSubredditsToFavorites(List<String> labels) {
        APP_MANAGER.getSubredditsHelper().clickEditButton();
        APP_MANAGER.getSubredditsHelper().addSubredditsToFavorites(labels);
        APP_MANAGER.getMainHelper().clickSubredditsButton();
        for (String label : labels) {
            assertTrue(APP_MANAGER.getSubredditsHelper().isSubredditStarFilled(label),
                    String.format("Subreddit %s was added to favorites", label));
        }
        APP_MANAGER.getSubredditsHelper().removeSubredditsFromFavorites(labels);
        APP_MANAGER.getSubredditsHelper().clickDoneButton();
    }


    @ParameterizedTest
    @ArgumentsSource(SubredditsViewArgumentsProvider.class)
    @Tag("subreddits")
    @DisplayName("Test reversing favorite subreddits order")
    @Order(2)
    public void testReversingFavouriteSubredditsOrder(List<String> labels) {
        APP_MANAGER.getSubredditsHelper().clickEditButton();
        APP_MANAGER.getSubredditsHelper().addSubredditsToFavorites(labels);
        APP_MANAGER.getMainHelper().clickSubredditsButton();
        for (int i = labels.size() - 1; i > 0; i--) {
            APP_MANAGER.getSubredditsHelper().dragAndDropSubreddit(labels.get(i), labels.get(0));
        }
        APP_MANAGER.getSubredditsHelper().clickDoneButton();
        int counter = labels.size() + 1;
        List<String> newSuberdditLabels = APP_MANAGER.getSubredditsHelper().getSubredditLabels();
        for (String label : labels) {
            assertEquals(label, newSuberdditLabels.get(counter), String.format("Subreddit %s was dragged correctly", label));
            counter--;
        }
        APP_MANAGER.getSubredditsHelper().clickEditButton();
        APP_MANAGER.getSubredditsHelper().removeSubredditsFromFavorites(labels);
        APP_MANAGER.getSubredditsHelper().clickDoneButton();
    }

    @ParameterizedTest
    @ArgumentsSource(SubredditsViewArgumentsProvider.class)
    @Tag("subreddits")
    @DisplayName("Test removing subreddits from favorites")
    @Order(3)
    public void testRemovingSubredditsFromFavorites(List<String> labels) {
        APP_MANAGER.getSubredditsHelper().clickEditButton();
        APP_MANAGER.getSubredditsHelper().addSubredditsToFavorites(labels);
        APP_MANAGER.getMainHelper().clickSubredditsButton();
        APP_MANAGER.getSubredditsHelper().removeSubredditsFromFavorites(labels);
        for (String label : labels) {
            assertFalse(APP_MANAGER.getSubredditsHelper().isSubredditStarFilled(label),
                    String.format("Subreddit %s was removed from favorites", label));
        }
        APP_MANAGER.getSubredditsHelper().clickDoneButton();
    }


}

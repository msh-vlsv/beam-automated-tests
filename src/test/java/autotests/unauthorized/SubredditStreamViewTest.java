package autotests.unauthorized;

import autotests.argumentsprovider.SubredditStreamViewArgumentsProvider;
import autotests.common.preconditions.UnauthorizedSubredditsPrecondition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubredditStreamViewTest extends UnauthorizedSubredditsPrecondition {

    @ParameterizedTest
    @ArgumentsSource(SubredditStreamViewArgumentsProvider.class)
    @Tag("subreddits")
    @DisplayName("Test opening subreddit stream")
    @Order(1)
    public void testOpeningSubredditStream(String label) {
        APP_MANAGER.getSubredditsHelper().clickSubredditButton(label);
        assertEquals(label, APP_MANAGER.getSubredditStreamHelper().getSubredditStreamName(), "Subreddit name is correct");
        APP_MANAGER.getSubredditStreamHelper().clickCloseButton();
        APP_MANAGER.getMainHelper().clickSubredditsButton();
    }
}

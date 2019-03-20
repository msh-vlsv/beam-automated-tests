package autotests.unauthorized;

import autotests.common.preconditions.UnauthorizedSearchPrecondition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchViewTest extends UnauthorizedSearchPrecondition {

    private static final String SEARCH_QUERY = "test";

    @Test
    @Tag("search")
    @DisplayName("Test are search suggestions appear")
    @Order(1)
    public void testAreSearchSuggestionsAppear() {
        APP_MANAGER.getSearchHelper().typeSearchQuery(SEARCH_QUERY);
        assertEquals("Search subreddits with " + SEARCH_QUERY, APP_MANAGER.getSearchHelper().getSearchSubredditsSuggestionText(),
                "\"Search subreddits with\" suggestion is visible");
        assertEquals("Search posts with " + SEARCH_QUERY, APP_MANAGER.getSearchHelper().getSearchPostsSuggestionText(),
                "\"Search posts with\" suggestion is visible");
        assertEquals("Go to subreddit /r/" + SEARCH_QUERY, APP_MANAGER.getSearchHelper().getGoToSubredditSuggestionText(),
                "\"Go to subreddit\" suggestion is visible");
        assertEquals("Go to user /u/" + SEARCH_QUERY, APP_MANAGER.getSearchHelper().getGoToUserSuggestionText(),
                "\"Go to user\" suggestion is visible");
    }
}

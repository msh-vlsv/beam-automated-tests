package autotests.unauthorized;

import autotests.common.preconditions.UnauthorizedSubredditsPrecondition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.InputPropertiesConstants.UNAUTHORIZED_SUBREDDITS_NUMBER;
import static utils.ParametersLoader.getInputDataProperty;

public class SubredditStreamViewTest extends UnauthorizedSubredditsPrecondition {

    private static Stream<Arguments> subredditIndexesProvider() {
        int subredditsCount = Integer.parseInt(getInputDataProperty(UNAUTHORIZED_SUBREDDITS_NUMBER));
        int[] indexes = new Random().ints(2, subredditsCount).distinct().limit(5).toArray();
        return Stream.of(indexes[0], indexes[1], indexes[2], indexes[3], indexes[4]).map(Arguments::of);
    }

    private String getLabelForTest(int index) {
        List<String> subredditLabels = APP_MANAGER.getSubredditsHelper().getSubredditLabels();
        return subredditLabels.get(index);
    }

    @ParameterizedTest(name = "run #{index} with subreddit number {arguments}")
    @MethodSource("subredditIndexesProvider")
    @Tag("subreddits")
    @DisplayName("Test opening subreddit stream")
    @Order(1)
    public void testOpeningSubredditStream(int index) {
        String label = getLabelForTest(index);
        APP_MANAGER.getSubredditsHelper().clickSubredditButton(label);
        assertEquals(label, APP_MANAGER.getSubredditStreamHelper().getSubredditStreamName(), "Subreddit name is correct");
        APP_MANAGER.getSubredditStreamHelper().clickCloseButton();
        APP_MANAGER.getMainHelper().clickSubredditsButton();
    }
}

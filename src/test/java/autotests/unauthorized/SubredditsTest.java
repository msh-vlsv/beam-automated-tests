package autotests.unauthorized;

import autotests.common.preconditions.UnauthorizedSubredditsPrecondition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static utils.InputPropertiesConstants.UNAUTHORIZED_SUBREDDITS_NUMBER;
import static utils.ParametersLoader.getInputDataProperty;

public class SubredditsTest extends UnauthorizedSubredditsPrecondition {

    private static final int ARGUMENTS_COUNT = 6;

    private static Stream<Arguments> subredditsIndexesProvider() {
        int subredditsNumber = Integer.parseInt(getInputDataProperty(UNAUTHORIZED_SUBREDDITS_NUMBER));
        int[] indexes = new Random().ints(2, subredditsNumber).distinct().limit(ARGUMENTS_COUNT).toArray();
        Arrays.sort(indexes);
        return Stream.of(indexes).map(Arguments::of);
    }

    private List<String> getLabelsForTest(int[] indexes) {
        List<String> subredditLabels = APP_MANAGER.getSubredditsHelper().getSubredditLabels();
        List<String> labelsForTest = new ArrayList<>();
        for (int index : indexes) {
            labelsForTest.add(subredditLabels.get(index));
        }
        return labelsForTest;
    }

    @ParameterizedTest(name = "run #{index} with subreddits numbers {arguments}")
    @MethodSource("subredditsIndexesProvider")
    @Tag("subreddits")
    @DisplayName("Test adding subreddits to favorites")
    @Order(1)
    public void testAddingSubredditsToFavorites(int[] indexes) {
        List<String> labelsForTest = getLabelsForTest(indexes);
        APP_MANAGER.getSubredditsHelper().clickEditButton();
        APP_MANAGER.getSubredditsHelper().addSubredditsToFavorites(labelsForTest);
        APP_MANAGER.getMainHelper().clickSubredditsButton();
        for (String label : labelsForTest) {
            assertTrue(APP_MANAGER.getSubredditsHelper().isSubredditStarFilled(label),
                    String.format("Subreddit %s was added to favorites", label));
        }
        APP_MANAGER.getSubredditsHelper().removeSubredditsFromFavorites(labelsForTest);
        APP_MANAGER.getSubredditsHelper().clickDoneButton();
    }


    @ParameterizedTest(name = "run #{index} with subreddits numbers {arguments}")
    @MethodSource("subredditsIndexesProvider")
    @Tag("subreddits")
    @DisplayName("Test reversing favorite subreddits order")
    @Order(2)
    public void testReversingFavouriteSubredditsOrder(int[] indexes) {
        List<String> labelsForTest = getLabelsForTest(indexes);
        APP_MANAGER.getSubredditsHelper().clickEditButton();
        APP_MANAGER.getSubredditsHelper().addSubredditsToFavorites(labelsForTest);
        APP_MANAGER.getMainHelper().clickSubredditsButton();
        for (int i = labelsForTest.size() - 1; i > 0; i--) {
            APP_MANAGER.getSubredditsHelper().dragAndDropSubreddit(labelsForTest.get(i), labelsForTest.get(0));
        }
        APP_MANAGER.getSubredditsHelper().clickDoneButton();
        int counter = labelsForTest.size() + 1;
        List<String> newSuberdditLabels = APP_MANAGER.getSubredditsHelper().getSubredditLabels();
        for (String label : labelsForTest) {
            assertEquals(label, newSuberdditLabels.get(counter), String.format("Subreddit %s was dragged correctly", label));
            counter--;
        }
        APP_MANAGER.getSubredditsHelper().clickEditButton();
        APP_MANAGER.getSubredditsHelper().removeSubredditsFromFavorites(labelsForTest);
        APP_MANAGER.getSubredditsHelper().clickDoneButton();
    }

    @ParameterizedTest(name = "run #{index} with subreddits numbers {arguments}")
    @MethodSource("subredditsIndexesProvider")
    @Tag("subreddits")
    @DisplayName("Test removing subreddits from favorites")
    @Order(3)
    public void testRemovingSubredditsFromFavorites(int[] indexes) {
        List<String> labelsForTest = getLabelsForTest(indexes);
        APP_MANAGER.getSubredditsHelper().clickEditButton();
        APP_MANAGER.getSubredditsHelper().addSubredditsToFavorites(labelsForTest);
        APP_MANAGER.getMainHelper().clickSubredditsButton();
        APP_MANAGER.getSubredditsHelper().removeSubredditsFromFavorites(labelsForTest);
        for (String label : labelsForTest) {
            assertFalse(APP_MANAGER.getSubredditsHelper().isSubredditStarFilled(label),
                    String.format("Subreddit %s was removed from favorites", label));
        }
        APP_MANAGER.getSubredditsHelper().clickDoneButton();
    }


}

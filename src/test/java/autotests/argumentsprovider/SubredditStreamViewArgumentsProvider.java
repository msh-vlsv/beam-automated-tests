package autotests.argumentsprovider;

import autotests.common.TestBase;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubredditStreamViewArgumentsProvider extends TestBase implements ArgumentsProvider {

    private static final int TESTS_COUNT = 5;

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        List<String> subredditLabels = APP_MANAGER.getSubredditsHelper().getSubredditLabels();
        int subredditsCount = subredditLabels.size();
        int[] indexes = new Random().ints(0, subredditsCount).distinct().limit(TESTS_COUNT).toArray();
        Arrays.sort(indexes);
        String[] labels = new String[TESTS_COUNT];
        for (int i = 0; i < TESTS_COUNT; i++) {
            labels[i] = subredditLabels.get(indexes[i]);
        }
        return Stream.of(labels).map(Arguments::of);

    }
}

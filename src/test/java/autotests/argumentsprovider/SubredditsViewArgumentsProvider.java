package autotests.argumentsprovider;

import autotests.common.TestBase;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubredditsViewArgumentsProvider extends TestBase implements ArgumentsProvider {

    private static final int ARGUMENTS_COUNT = 6;

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        List<String> subredditLabels = APP_MANAGER.getSubredditsHelper().getSubredditLabels();
        int subredditsCount = subredditLabels.size();
        int[] indexes = new Random().ints(2, subredditsCount).distinct().limit(ARGUMENTS_COUNT).toArray();
        Arrays.sort(indexes);
        List<String > labels = new ArrayList<>();
        for (int i : indexes) {
            labels.add(subredditLabels.get(i));
        }
        return Stream.of(arguments(labels));
    }
}

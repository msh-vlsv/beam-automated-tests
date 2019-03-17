package ui.appviews.main.search.elements.suggestions;

import ui.common.elements.LocatorType;
import ui.common.elements.Text;

public class GoToSubredditSuggestion extends Text {

    private static final String NS_PREDICATE = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Go to subreddit /r/'";
    private static final String NAME = "Suggestion Go to subreddit /r/...";

    public GoToSubredditSuggestion() {
        super(LocatorType.IOS_NS_PREDICATE, NS_PREDICATE, NAME);
    }
}

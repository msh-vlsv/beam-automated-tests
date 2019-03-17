package ui.appviews.main.search.elements.suggestions;

import ui.common.elements.LocatorType;
import ui.common.elements.Text;

public class GoToUserSuggestion extends Text {

    private static final String NS_PREDICATE = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Go to user /u/'";
    private static final String NAME = "Suggestion Go to user /u/...";

    public GoToUserSuggestion() {
        super(LocatorType.IOS_NS_PREDICATE, NS_PREDICATE, NAME);
    }
}

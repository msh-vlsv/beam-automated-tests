package ui.appviews.main.search.elements.suggestions;

import ui.common.elements.LocatorType;
import ui.common.elements.Text;

public class SearchPostsSuggestion extends Text {

    private static final String NS_PREDICATE = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Search posts with'";
    private static final String NAME = "Suggestion Search posts with...";

    public SearchPostsSuggestion() {
        super(LocatorType.IOS_NS_PREDICATE, NS_PREDICATE, NAME);
    }
}

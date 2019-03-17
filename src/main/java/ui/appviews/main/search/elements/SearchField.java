package ui.appviews.main.search.elements;

import ui.common.elements.LocatorType;
import ui.common.elements.TextField;

public class SearchField extends TextField {

    private static final String NS_PREDICATE = "type == 'XCUIElementTypeSearchField'";
    private static final String NAME = "Search field";

    public SearchField() {
        super(LocatorType.IOS_NS_PREDICATE, NS_PREDICATE, NAME);
    }
}

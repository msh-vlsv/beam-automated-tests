package ui.appviews.main.tabbar.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class SearchButton extends ClickableElement {

    private static final String NS_PREDICATE = "type == 'XCUIElementTypeButton' AND name == 'Search'";
    private static final String NAME = "Search button";

    public SearchButton() {
        super(LocatorType.IOS_NS_PREDICATE, NS_PREDICATE, NAME);
    }
}

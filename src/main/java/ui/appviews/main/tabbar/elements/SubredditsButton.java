package ui.appviews.main.tabbar.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class SubredditsButton extends ClickableElement {

    private static final String NS_PREDICATE = "type == 'XCUIElementTypeButton' AND name == 'Subreddits' AND value == '1'";
    private static final String NAME = "Subreddits button";

    public SubredditsButton() {
        super(LocatorType.IOS_NS_PREDICATE, NS_PREDICATE, NAME);
    }
}

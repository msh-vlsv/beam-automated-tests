package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class ReorderButton extends ClickableElement {

    private static final String PREDICATE = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Reorder' AND name ENDSWITH '%s'";
    private static final String NAME = "Reorder button of %s subreddit";

    public ReorderButton(String textLabel) {
        super(LocatorType.IOS_NS_PREDICATE, String.format(PREDICATE, textLabel), String.format(NAME, textLabel));
    }
}

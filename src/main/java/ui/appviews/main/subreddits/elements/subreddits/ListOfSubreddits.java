package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ListOfElements;
import ui.common.elements.LocatorType;

public class ListOfSubreddits extends ListOfElements {

    private static final String XPATH = "//XCUIElementTypeCell/XCUIElementTypeStaticText[1]";
    private static final String NAME = "List of subreddits";

    public ListOfSubreddits() {
        super(LocatorType.XPATH, XPATH, NAME);
    }

    public SubredditButton getSubredditButton(String textLabel) {
        return new SubredditButton(textLabel);
    }
}

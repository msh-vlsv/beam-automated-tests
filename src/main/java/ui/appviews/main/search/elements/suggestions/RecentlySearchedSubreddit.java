package ui.appviews.main.search.elements.suggestions;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class RecentlySearchedSubreddit extends ClickableElement {

    private static final String XPATH = "//XCUIElementTypeOther[@name='RECENTLY SEARCHED SUBREDDITS']/following-sibling::XCUIElementTypeCell[1]/XCUIElementTypeStaticText";
    private static final String NAME = "Recently searched subreddit";

    public RecentlySearchedSubreddit() {
        super(LocatorType.XPATH, XPATH, NAME);
    }
}

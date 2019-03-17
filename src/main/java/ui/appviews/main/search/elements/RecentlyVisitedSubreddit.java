package ui.appviews.main.search.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class RecentlyVisitedSubreddit extends ClickableElement {

    private static final String XPATH = "//XCUIElementTypeOther[@name='RECENTLY VISITED SUBREDDITS']/following-sibling::XCUIElementTypeCell[1]/XCUIElementTypeStaticText";
    private static final String NAME = "Recently visited subreddit";

    public RecentlyVisitedSubreddit() {
        super(LocatorType.XPATH, XPATH, NAME);
    }
}

package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class StarTodayilearned extends ClickableElement {

    private static final String XPATH = "//XCUIElementTypeStaticText[@name='todayilearned']/following-sibling::XCUIElementTypeButton";
    private static final String NAME = "Star for todayilearned subreddit";

    public StarTodayilearned() {
        super(LocatorType.XPATH, XPATH, NAME);
    }
}

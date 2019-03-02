package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class StarMovies extends ClickableElement {

    private static final String XPATH = "//XCUIElementTypeStaticText[@name='movies']/following-sibling::XCUIElementTypeButton";
    private static final String NAME = "Star for movies subreddit";

    public StarMovies() {
        super(LocatorType.XPATH, XPATH, NAME);
    }
}

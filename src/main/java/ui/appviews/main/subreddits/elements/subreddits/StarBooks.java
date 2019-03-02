package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class StarBooks extends ClickableElement {

    private static final String XPATH = "//XCUIElementTypeStaticText[@name='books']/following-sibling::XCUIElementTypeButton";
    private static final String NAME = "Star for books subreddit";

    public StarBooks() {
        super(LocatorType.XPATH, XPATH, NAME);
    }
}

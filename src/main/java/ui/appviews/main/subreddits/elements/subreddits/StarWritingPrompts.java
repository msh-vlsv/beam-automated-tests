package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class StarWritingPrompts extends ClickableElement {

    private static final String XPATH = "//XCUIElementTypeStaticText[@name='WritingPrompts']/following-sibling::XCUIElementTypeButton";
    private static final String NAME = "Star for WritingPrompts subreddit";

    public StarWritingPrompts() {
        super(LocatorType.XPATH, XPATH, NAME);
    }
}

package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class Star extends ClickableElement {

    private static final String XPATH = "//XCUIElementTypeStaticText[@name='%s']/following-sibling::XCUIElementTypeButton";
    private static final String NAME = "Star of %s subreddit";

    public Star(String textLabel) {
        super(LocatorType.XPATH, String.format(XPATH, textLabel), String.format(NAME, textLabel));

    }
}

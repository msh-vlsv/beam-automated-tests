package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class StarAww extends ClickableElement {

    private static final String XPATH = "//XCUIElementTypeStaticText[@name='aww']/following-sibling::XCUIElementTypeButton";
    private static final String NAME = "Star for aww subreddit";

    public StarAww() {
        super(LocatorType.XPATH, XPATH, NAME);
    }

}

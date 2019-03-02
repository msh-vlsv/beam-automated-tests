package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class StarExplainlikeimfive extends ClickableElement {

    private static final String XPATH = "//XCUIElementTypeStaticText[@name='explainlikeimfive']/following-sibling::XCUIElementTypeButton";
    private static final String NAME = "Star for explainlikeimfive subreddit";

    public StarExplainlikeimfive() {
        super(LocatorType.XPATH, XPATH, NAME);
    }
}

package ui.appviews.main.tabbar.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class SubredditsButton extends ClickableElement {

    private static final String CLASS_CHAIN = "**/XCUIElementTypeTabBar/XCUIElementTypeButton[`name == 'Subreddits'`]";
    private static final String NAME = "Subreddits button";

    public SubredditsButton() {
        super(LocatorType.IOS_CLASS_CHAIN, CLASS_CHAIN, NAME);
    }
}

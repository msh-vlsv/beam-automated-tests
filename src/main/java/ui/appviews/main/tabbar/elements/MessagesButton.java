package ui.appviews.main.tabbar.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class MessagesButton extends ClickableElement {

    private static final String NS_PREDICATE = "type == 'XCUIElementTypeButton' AND name == 'Messages'";
    private static final String NAME = "Messages button";

    public MessagesButton() {
        super(LocatorType.IOS_NS_PREDICATE, NS_PREDICATE, NAME);
    }
}

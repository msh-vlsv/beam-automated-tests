package ui.appviews.welcome.elements;

import ui.common.elements.LocatorType;
import ui.common.elements.NonEditableTextField;

public class Message extends NonEditableTextField {

    private static final String NS_PREDICATE = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Explore reddit'";
    private static final String NAME = "Welcome view message";

    public Message() {
        super(LocatorType.IOS_NS_PREDICATE, NS_PREDICATE, NAME);
    }
}

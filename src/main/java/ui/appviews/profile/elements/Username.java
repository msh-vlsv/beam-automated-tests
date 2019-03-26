package ui.appviews.profile.elements;

import ui.common.elements.LocatorType;
import ui.common.elements.Text;

public class Username extends Text {

    private static final String CLASS_CHAIN = "**/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText";
    private static final String NAME = "Username";

    public Username() {
        super(LocatorType.IOS_CLASS_CHAIN, CLASS_CHAIN, NAME);
    }
}

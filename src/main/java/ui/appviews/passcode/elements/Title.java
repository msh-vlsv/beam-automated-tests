package ui.appviews.passcode.elements;

import ui.common.elements.LocatorType;
import ui.common.elements.Text;

public class Title extends Text {

    private static final String NS_PREDICATE = "type == 'XCUIElementTypeNavigationBar' AND name == 'Passcode'";
    private static final String NAME = "Passcode title";

    public Title() {
        super(LocatorType.IOS_NS_PREDICATE, NS_PREDICATE, NAME);
    }
}

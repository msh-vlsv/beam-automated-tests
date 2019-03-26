package ui.appviews.login.elements;

import ui.common.elements.Checkbox;
import ui.common.elements.LocatorType;

public class RememberMeCheckbox extends Checkbox {

    private static final String NS_PREDICATE = "type == 'XCUIElementTypeOther' AND name == 'remember me'";
    private static final String NAME = "Rememnber me checkbox";

    public RememberMeCheckbox() {
        super(LocatorType.IOS_NS_PREDICATE, NS_PREDICATE, NAME);
    }
}

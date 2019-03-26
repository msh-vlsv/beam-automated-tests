package ui.appviews.login.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class AllowButton extends ClickableElement {

    private static final String ID = "Allow";
    private static final String NAME = "Allow button";

    public AllowButton() {
        super(LocatorType.ID, ID, NAME);
    }
}

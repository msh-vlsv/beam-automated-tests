package ui.appviews.main.subredditstream.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class CloseButton extends ClickableElement {

    private static final String ID = "navigationbar close";
    private static final String NAME = "Close button";

    public CloseButton() {
        super(LocatorType.ID, ID, NAME);
    }
}

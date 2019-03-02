package ui.appviews.main.subreddits.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class DoneButton extends ClickableElement {

    private static final String ID = "Done";
    private static final String NAME = "Done button";

    public DoneButton() {
        super(LocatorType.ID, ID, NAME);
    }
}

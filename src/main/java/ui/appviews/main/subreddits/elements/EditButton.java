package ui.appviews.main.subreddits.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class EditButton extends ClickableElement {

    private static final String ID = "Edit";
    private static final String NAME = "Edit button";

    public EditButton() {
        super(LocatorType.ID, ID, NAME);
    }
}

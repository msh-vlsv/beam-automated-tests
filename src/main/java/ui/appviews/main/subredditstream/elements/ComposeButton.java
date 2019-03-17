package ui.appviews.main.subredditstream.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class ComposeButton extends ClickableElement {

    private static final String ID = "compose icon";
    private static final String NAME = "Compose button";

    public ComposeButton() {
        super(LocatorType.ID, ID, NAME);
    }
}

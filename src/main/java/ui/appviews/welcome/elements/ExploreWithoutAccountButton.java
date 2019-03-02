package ui.appviews.welcome.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class ExploreWithoutAccountButton extends ClickableElement {

    private static final String ID = "Explore without account";
    private static final String NAME = "\"Explore without account\" button";

    public ExploreWithoutAccountButton() {
        super(LocatorType.ID, ID, NAME);
    }
}

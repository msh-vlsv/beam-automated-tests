package ui.appviews.main.subreddits.elements.segmentedcontrol.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class MultiredditsButton extends ClickableElement {

    private static final String ID = "Multireddits";
    private static final String NAME = "Multireddits button";

    public MultiredditsButton() {
        super(LocatorType.ID, ID, NAME);
    }
}

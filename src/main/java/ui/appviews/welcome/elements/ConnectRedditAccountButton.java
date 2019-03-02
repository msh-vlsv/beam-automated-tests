package ui.appviews.welcome.elements;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class ConnectRedditAccountButton extends ClickableElement {

    private static final String ID = "Connect reddit account";
    private static final String NAME = "\"Connect reddit account\" button";

    public ConnectRedditAccountButton() {
        super(LocatorType.ID, ID, NAME);
    }
}

package ui.appviews.welcome.elements;

import ui.common.elements.LocatorType;
import ui.common.elements.NonEditableTextField;

public class Headline extends NonEditableTextField {

    private static final String ID = "Welcome to Beam 2";
    private static final String NAME = "Welcome view headline";

    public Headline() {
        super(LocatorType.ID, ID, NAME);
    }
}

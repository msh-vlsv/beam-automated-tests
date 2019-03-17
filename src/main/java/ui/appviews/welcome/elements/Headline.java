package ui.appviews.welcome.elements;

import ui.common.elements.LocatorType;
import ui.common.elements.Text;

public class Headline extends Text {

    private static final String ID = "Welcome to Beam 2";
    private static final String NAME = "Welcome view headline";

    public Headline() {
        super(LocatorType.ID, ID, NAME);
    }
}

package ui.appviews.subredditstream.elements;

import ui.common.elements.LocatorType;
import ui.common.elements.Text;

public class SubredditName extends Text {

    private static final String CLASS_CHAIN = "**/XCUIElementTypeNavigationBar[`name == 'beam.SubredditStreamView'`]/XCUIElementTypeStaticText/XCUIElementTypeStaticText";
    private static final String NAME = "Subreddit name";

    public SubredditName() {
        super(LocatorType.IOS_CLASS_CHAIN, CLASS_CHAIN, NAME);
    }
}

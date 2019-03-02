package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class SubredditFrontpage extends ClickableElement {

    private static final String ID = "Frontpage";
    private static final String NAME = "Subreddit Frontpage";

    public SubredditFrontpage() {
        super(LocatorType.ID, ID, NAME);
    }

}

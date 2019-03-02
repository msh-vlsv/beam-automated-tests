package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class SubredditAww extends ClickableElement {

    private static final String ID = "aww";
    private static final String NAME = "Subreddit aww";

    public SubredditAww() {
        super(LocatorType.ID, ID, NAME);
    }

}

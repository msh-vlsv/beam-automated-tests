package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class SubredditBooks extends ClickableElement {

    private static final String ID = "books";
    private static final String NAME = "Subreddit books";

    public SubredditBooks() {
        super(LocatorType.ID, ID, NAME);
    }
}

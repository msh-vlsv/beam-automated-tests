package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class SubredditMovies extends ClickableElement {

    private static final String ID = "movies";
    private static final String NAME = "Subreddit movies";

    public SubredditMovies() {
        super(LocatorType.ID, ID, NAME);
    }
}

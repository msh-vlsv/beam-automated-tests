package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class SubredditTodayilearned extends ClickableElement {

    private static final String ID = "todayilearned";
    private static final String NAME = "Subreddit todayilearned";

    public SubredditTodayilearned() {
        super(LocatorType.ID, ID, NAME);
    }
}

package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class SubredditWritingPrompts extends ClickableElement {

    private static final String ID = "WritingPrompts";
    private static final String NAME = "Subreddit WritingPrompts";

    public SubredditWritingPrompts() {
        super(LocatorType.ID, ID, NAME);
    }
}
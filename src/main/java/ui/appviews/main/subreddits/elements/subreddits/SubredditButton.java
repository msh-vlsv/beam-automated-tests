package ui.appviews.main.subreddits.elements.subreddits;

import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

public class SubredditButton extends ClickableElement {

    private static final String NAME = "Subreddit %s";

    private Star star;
    private ReorderButton reorderButton;

    public SubredditButton(String textLabel) {
        super(LocatorType.ID, textLabel, String.format(NAME, textLabel));
        star = new Star(textLabel);
        reorderButton = new ReorderButton(textLabel);
    }

    public Star getStar() {
        return star;
    }

    public ReorderButton getReorderButton() {
        return reorderButton;
    }
}

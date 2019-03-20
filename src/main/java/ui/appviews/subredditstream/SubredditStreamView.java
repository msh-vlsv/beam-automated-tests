package ui.appviews.subredditstream;

import ui.appviews.subredditstream.elements.CloseButton;
import ui.appviews.subredditstream.elements.ComposeButton;
import ui.appviews.subredditstream.elements.SubredditName;
import ui.common.views.ScrollView;

public class SubredditStreamView extends ScrollView {

    private static final String NAME = "Subreddit stream view";

    private SubredditName subredditName = new SubredditName();
    private CloseButton closeButton = new CloseButton();
    private ComposeButton composeButton = new ComposeButton();

    public SubredditStreamView() {
        super(new SubredditName(), NAME);
    }

    public SubredditName getSubredditName() {
        return subredditName;
    }

    public CloseButton getCloseButton() {
        return closeButton;
    }

    public ComposeButton getComposeButton() {
        return composeButton;
    }
}

package ui.appviews.main.subredditstream;

import ui.appviews.main.subredditstream.elements.SubredditName;
import ui.common.views.ScrollView;

public class SubredditStreamView extends ScrollView {

    private static final String NAME = "Subreddit stream view";

    public SubredditStreamView() {
        super(new SubredditName(), NAME);
    }
}

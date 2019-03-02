package ui.appviews.main.subreddits;

import ui.appviews.main.subreddits.elements.DoneButton;
import ui.appviews.main.subreddits.elements.EditButton;
import ui.appviews.main.subreddits.elements.segmentedcontrol.SegmentedControl;
import ui.appviews.main.subreddits.elements.subreddits.*;
import ui.common.elements.ClickableElement;
import ui.common.views.ScrollView;

import java.util.LinkedHashMap;
import java.util.Map;

public class SubredditsView extends ScrollView {

    private static final String NAME = "Subreddits view";

    private EditButton editButton = new EditButton();
    private Map<ClickableElement, ClickableElement> subreddits = new LinkedHashMap<>();
    private DoneButton doneButton = new DoneButton();
    private SubredditFrontpage subredditFrontpage = new SubredditFrontpage();

    public SubredditsView() {
        super(new SegmentedControl(), NAME);
        addSubreddits();
    }

    private void addSubreddits() {
        subreddits.put(new SubredditAww(), new StarAww());
        subreddits.put(new SubredditBooks(), new StarBooks());
        subreddits.put(new SubredditExplainlikeimfive(), new StarExplainlikeimfive());
        subreddits.put(new SubredditMovies(), new StarMovies());
        subreddits.put(new SubredditTodayilearned(), new StarTodayilearned());
        subreddits.put(new SubredditWritingPrompts(), new StarWritingPrompts());
    }

    public EditButton getEditButton() {
        return editButton;
    }

    public Map<ClickableElement, ClickableElement> getSubreddits() {
        return subreddits;
    }

    public DoneButton getDoneButton() {
        return doneButton;
    }

    public SubredditFrontpage getSubredditFrontpage() {
        return subredditFrontpage;
    }
}

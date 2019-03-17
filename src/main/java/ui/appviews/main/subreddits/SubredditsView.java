package ui.appviews.main.subreddits;

import ui.appviews.main.subreddits.elements.DoneButton;
import ui.appviews.main.subreddits.elements.EditButton;
import ui.appviews.main.subreddits.elements.segmentedcontrol.SegmentedControl;
import ui.appviews.main.subreddits.elements.subreddits.ListOfSubreddits;
import ui.common.views.ScrollView;

public class SubredditsView extends ScrollView {

    private static final String NAME = "Subreddits view";

    private EditButton editButton = new EditButton();
    private DoneButton doneButton = new DoneButton();
    private ListOfSubreddits listOfSubreddits = new ListOfSubreddits();

    public SubredditsView() {
        super(new SegmentedControl(), NAME);
    }

    public EditButton getEditButton() {
        return editButton;
    }

    public DoneButton getDoneButton() {
        return doneButton;
    }

    public ListOfSubreddits getListOfSubreddits() {
        return listOfSubreddits;
    }
}

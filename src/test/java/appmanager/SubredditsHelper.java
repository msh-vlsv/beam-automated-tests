package appmanager;

import io.qameta.allure.Step;
import ui.appviews.main.subreddits.SubredditsView;
import ui.appviews.main.subreddits.elements.subreddits.ReorderButton;
import ui.appviews.main.subreddits.elements.subreddits.Star;
import ui.appviews.main.subreddits.elements.subreddits.SubredditButton;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubredditsHelper extends HelperBase {

    private SubredditsView subredditsView = new SubredditsView();

    public List<String> getSubredditLabels() {
        return subredditsView.getListOfSubreddits().getLabels();
    }

    @Step("Click Edit button")
    public void clickEditButton() {
        subredditsView.getEditButton().click();
    }

    @Step("Click Done button")
    public void clickDoneButton() {
        subredditsView.getDoneButton().click();
    }

    @Step("Add subreddit {label} to favorites")
    public void addSubredditToFavorites(String label) {
        SubredditButton subredditButton = subredditsView.getListOfSubreddits().getSubredditButton(label);
        subredditsView.scrollDownToElement(subredditButton);
        Star star = subredditButton.getStar();
        assertEquals("tableview star", star.getLabel());
        star.click();
    }

    @Step("Remove subreddit {label} from favorites")
    public void removeSubredditFromFavorites(String label) {
        SubredditButton subredditButton = subredditsView.getListOfSubreddits().getSubredditButton(label);
        subredditsView.scrollDownToElement(subredditButton);
        Star star = subredditButton.getStar();
        assertEquals("tableview star filled", star.getLabel());
        star.click();
    }

    public void addSubredditsToFavorites(List<String> labels) {
        for (String label : labels) {
            addSubredditToFavorites(label);
        }
    }

    public void removeSubredditsFromFavorites(List<String> labels) {
        for (String label : labels) {
            removeSubredditFromFavorites(label);
        }
    }

    public boolean isSubredditStarFilled(String label) {
        SubredditButton subredditButton = subredditsView.getListOfSubreddits().getSubredditButton(label);
        subredditsView.scrollDownToElement(subredditButton);
        Star star = subredditButton.getStar();
        return star.getLabel().equals("tableview star filled");
    }

    @Step("Drag and drop subreddit {sourceLabel} to subreddit {destinationLabel}")
    public void dragAndDropSubreddit(String sourceLabel, String  destinationLabel) {
        SubredditButton sourceSubredditButton = subredditsView.getListOfSubreddits().getSubredditButton(sourceLabel);
        ReorderButton sourceReorderButton = sourceSubredditButton.getReorderButton();
        SubredditButton destinationSubredditButton = subredditsView.getListOfSubreddits().getSubredditButton(destinationLabel);
        ReorderButton destinationReorderButton = destinationSubredditButton.getReorderButton();
        sourceReorderButton.dragAndDrop(destinationReorderButton);
    }

}

package appmanager;

import io.qameta.allure.Step;
import ui.appviews.main.subreddits.SubredditsView;
import ui.common.elements.ClickableElement;

import java.util.Map;

public class SubredditsHelper extends HelperBase {

    private SubredditsView subredditsView = new SubredditsView();

    private Map<ClickableElement, ClickableElement> subreddits = subredditsView.getSubreddits();

    @Step("Click Edit button")
    public void clickEditButton() {
        subredditsView.getEditButton().click();
    }

    @Step("Click Done button")
    public void clickDoneButton() {
        subredditsView.getDoneButton().click();
    }

    @Step("Add subreddits to favorites")
    public void addSubredditsToFavorites() {
        for (ClickableElement subreddit: subreddits.keySet()) {
            subredditsView.scrollDownToElement(subreddit);
            subreddits.get(subreddit).click();
        }
    }

    @Step("Remove subreddits from favorites")
    public void removeSubredditsFromFavorites() {
        for (ClickableElement subreddit: subreddits.keySet()) {
            subreddits.get(subreddit).click();
        }
    }

    @Step("Scroll page to the beginning")
    public void scrollPageToTheBeginning() {
        subredditsView.scrollUpToElement(subredditsView.getSubredditFrontpage());
    }

    public boolean areSubredditsAddedToFavorites() {
        for (ClickableElement subreddit: subreddits.keySet()) {
            if (!subreddits.get(subreddit).getAttributeLabel().equals("tableview star filled")) {
                return false;
            }
        }
        return true;
    }

    public boolean areSubredditsRemovedFromFavorites() {
        for (ClickableElement subreddit: subreddits.keySet()) {
            subredditsView.scrollDownToElement(subreddit);
            if (!subreddits.get(subreddit).getAttributeLabel().equals("tableview star")) {
                return false;
            }
        }
        return true;
    }

}

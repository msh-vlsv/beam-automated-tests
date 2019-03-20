package appmanager;

import io.qameta.allure.Step;
import ui.appviews.subredditstream.SubredditStreamView;

public class SubredditStreamHelper extends HelperBase {

    private SubredditStreamView subredditStreamView = new SubredditStreamView();

    public String getSubredditStreamName() {
        return subredditStreamView.getSubredditName().getLabel();
    }

    @Step("Click Close button")
    public void clickCloseButton() {
        subredditStreamView.getCloseButton().click();
    }


}

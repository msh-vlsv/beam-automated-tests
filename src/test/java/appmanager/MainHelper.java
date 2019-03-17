package appmanager;

import io.qameta.allure.Step;
import ui.appviews.main.MainView;

public class MainHelper extends HelperBase {

    private MainView mainView = new MainView();

    public boolean isMainViewVisible() {
        return mainView.isPageVisible();
    }

    @Step("Click Subreddits button")
    public void clickSubredditsButton() {
        mainView.getTabBar().getSubredditsButton().click();
    }

    @Step("Click Search button")
    public void clickSearchButton() {
        mainView.getTabBar().getSearchButton().click();
    }

    @Step("Click Messages button")
    public void clickMessagesButton() {
        mainView.getTabBar().getMessagesButton().click();
    }

    @Step("Click Profile button")
    public void clickProfileButton() {
        mainView.getTabBar().getProfileButton().click();
    }
}

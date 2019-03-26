package appmanager;

import io.qameta.allure.Step;
import ui.appviews.welcome.WelcomeView;

public class WelcomeHelper extends HelperBase {

    private WelcomeView landingPage = new WelcomeView();

    public boolean isLandingPageVisible() {
        return landingPage.isViewVisible();
    }

    public String getLandingPageHeadline() {
        return landingPage.getHeadline().getText();
    }

    public String getLandingPageMessage() {
        return landingPage.getMessage().getText();
    }

    @Step("Click Connect reddit account button")
    public void clickConnectRedditAccountButton() {
        landingPage.getConnectRedditAccountButton().click();
    }

    @Step("Click Explore without account button")
    public void clickExploreWithoutAccountButton() {
        landingPage.getExploreWithoutAccountButton().click();
    }
}

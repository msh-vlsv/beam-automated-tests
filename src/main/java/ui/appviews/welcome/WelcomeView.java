package ui.appviews.welcome;

import ui.appviews.welcome.elements.ConnectRedditAccountButton;
import ui.appviews.welcome.elements.ExploreWithoutAccountButton;
import ui.appviews.welcome.elements.Headline;
import ui.appviews.welcome.elements.Message;
import ui.common.views.BaseView;

public class WelcomeView extends BaseView {

    private static final String NAME = "Welcome view";

    private Headline headline = new Headline();
    private Message message = new Message();
    private ConnectRedditAccountButton connectRedditAccountButton = new ConnectRedditAccountButton();
    private ExploreWithoutAccountButton exploreWithoutAccountButton = new ExploreWithoutAccountButton();

    public WelcomeView() {
        super(new Headline(), NAME);
    }

    public Headline getHeadline() {
        return headline;
    }

    public Message getMessage() {
        return message;
    }

    public ConnectRedditAccountButton getConnectRedditAccountButton() {
        return connectRedditAccountButton;
    }

    public ExploreWithoutAccountButton getExploreWithoutAccountButton() {
        return exploreWithoutAccountButton;
    }
}

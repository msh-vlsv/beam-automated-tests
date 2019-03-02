package ui.appviews.main.tabbar;

import ui.appviews.main.tabbar.elements.MessagesButton;
import ui.appviews.main.tabbar.elements.ProfileButton;
import ui.appviews.main.tabbar.elements.SearchButton;
import ui.appviews.main.tabbar.elements.SubredditsButton;
import ui.common.elements.BaseElement;
import ui.common.elements.LocatorType;

public class TabBar extends BaseElement {

    private static final String NS_PREDICATE = "type == 'XCUIElementTypeTabBar'";
    private static final String NAME = "Tab bar";

    private SubredditsButton subredditsButton = new SubredditsButton();
    private SearchButton searchButton = new SearchButton();
    private MessagesButton messagesButton = new MessagesButton();
    private ProfileButton profileButton = new ProfileButton();

    public TabBar() {
        super(LocatorType.IOS_NS_PREDICATE, NS_PREDICATE, NAME);
    }

    public SubredditsButton getSubredditsButton() {
        return subredditsButton;
    }

    public SearchButton getSearchButton() {
        return searchButton;
    }

    public MessagesButton getMessagesButton() {
        return messagesButton;
    }

    public ProfileButton getProfileButton() {
        return profileButton;
    }
}

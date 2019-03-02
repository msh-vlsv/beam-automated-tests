package ui.appviews.main;

import ui.appviews.main.subreddits.SubredditsView;
import ui.appviews.main.tabbar.TabBar;
import ui.common.views.BaseView;

public class MainView extends BaseView {

    private static final String NAME = "Main view";

    private TabBar tabBar = new TabBar();
    private SubredditsView subredditsView = new SubredditsView();

    public MainView() {
        super(new TabBar(), NAME);
    }

    public TabBar getTabBar() {
        return tabBar;
    }

    public SubredditsView getSubredditsView() {
        return subredditsView;
    }
}

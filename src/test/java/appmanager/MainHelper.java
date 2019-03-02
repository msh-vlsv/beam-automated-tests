package appmanager;

import ui.appviews.main.MainView;

public class MainHelper extends HelperBase {

    private MainView mainView = new MainView();

    public boolean isMainViewVisible() {
        return mainView.isPageVisible();
    }
}

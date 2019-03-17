package appmanager;

public class AppManager {

    private WelcomeHelper welcomeHelper = new WelcomeHelper();
    private MainHelper mainHelper = new MainHelper();
    private SearchHelper searchHelper = new SearchHelper();
    private SubredditsHelper subredditsHelper = new SubredditsHelper();

    public WelcomeHelper getWelcomeHelper() {
        return welcomeHelper;
    }

    public MainHelper getMainHelper() {
        return mainHelper;
    }

    public SearchHelper getSearchHelper() {
        return searchHelper;
    }

    public SubredditsHelper getSubredditsHelper() {
        return subredditsHelper;
    }
}

package appmanager;

public class AppManager {

    private WelcomeHelper welcomeHelper = new WelcomeHelper();
    private MainHelper mainHelper = new MainHelper();
    private SearchHelper searchHelper = new SearchHelper();
    private SubredditsHelper subredditsHelper = new SubredditsHelper();
    private SubredditStreamHelper subredditStreamHelper = new SubredditStreamHelper();
    private LoginHelper loginHelper = new LoginHelper();
    private ProfileHelper profileHelper = new ProfileHelper();

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

    public SubredditStreamHelper getSubredditStreamHelper() {
        return subredditStreamHelper;
    }

    public LoginHelper getLoginHelper() {
        return loginHelper;
    }

    public ProfileHelper getProfileHelper() {
        return profileHelper;
    }
}

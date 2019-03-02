package appmanager;

public class AppManager {

    private WelcomeHelper welcomeHelper = new WelcomeHelper();
    private MainHelper mainHelper = new MainHelper();
    private SubredditsHelper subredditsHelper = new SubredditsHelper();

    public WelcomeHelper getWelcomeHelper() {
        return welcomeHelper;
    }

    public MainHelper getMainHelper() {
        return mainHelper;
    }

    public SubredditsHelper getSubredditsHelper() {
        return subredditsHelper;
    }
}

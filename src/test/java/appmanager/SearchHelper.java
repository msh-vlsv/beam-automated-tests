package appmanager;

import ui.appviews.main.search.SearchView;

public class SearchHelper extends HelperBase {

    private SearchView searchView = new SearchView();

    public void typeSearchQuery(String searchQuery) {
        searchView.getSearchField().type(searchQuery);
    }

    public String getSearchSubredditsSuggestionText() {
        return searchView.getSearchSubredditsSuggestion().getText();
    }

    public String getSearchPostsSuggestionText() {
        return searchView.getSearchPostsSuggestion().getText();
    }

    public String getGoToSubredditSuggestionText() {
        return searchView.getGoToSubredditSuggestion().getText();
    }

    public String getGoToUserSuggestionText() {
        return searchView.getGoToUserSuggestion().getText();
    }


}

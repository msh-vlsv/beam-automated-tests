package ui.appviews.main.search;

import ui.appviews.main.search.elements.SearchField;
import ui.appviews.main.search.elements.suggestions.GoToSubredditSuggestion;
import ui.appviews.main.search.elements.suggestions.GoToUserSuggestion;
import ui.appviews.main.search.elements.suggestions.SearchPostsSuggestion;
import ui.appviews.main.search.elements.suggestions.SearchSubredditsSuggestion;
import ui.common.views.ScrollView;

public class SearchView extends ScrollView {

    private static final String NAME = "Search field";

    private SearchField searchField = new SearchField();
    private SearchSubredditsSuggestion searchSubredditsSuggestion = new SearchSubredditsSuggestion();
    private SearchPostsSuggestion searchPostsSuggestion = new SearchPostsSuggestion();
    private GoToSubredditSuggestion goToSubredditSuggestion = new GoToSubredditSuggestion();
    private GoToUserSuggestion goToUserSuggestion = new GoToUserSuggestion();

    public SearchView() {
        super(new SearchField(), NAME);
    }

    public SearchField getSearchField() {
        return searchField;
    }

    public SearchSubredditsSuggestion getSearchSubredditsSuggestion() {
        return searchSubredditsSuggestion;
    }

    public SearchPostsSuggestion getSearchPostsSuggestion() {
        return searchPostsSuggestion;
    }

    public GoToSubredditSuggestion getGoToSubredditSuggestion() {
        return goToSubredditSuggestion;
    }

    public GoToUserSuggestion getGoToUserSuggestion() {
        return goToUserSuggestion;
    }
}

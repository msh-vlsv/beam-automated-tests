package ui.common.elements;

public class LoadingIndicator extends BaseElement {

    private static final String PREDICATE = "type == 'XCUIElementTypeActivityIndicator'";
    private static final String NAME = "Loading Indicator";

    public LoadingIndicator() {
        super(LocatorType.IOS_NS_PREDICATE, PREDICATE, NAME);
    }
}

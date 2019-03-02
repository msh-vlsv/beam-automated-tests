package ui.appviews.main.subreddits.elements.segmentedcontrol;

import ui.appviews.main.subreddits.elements.segmentedcontrol.elements.MultiredditsButton;
import ui.appviews.main.subreddits.elements.segmentedcontrol.elements.SubredditsButton;
import ui.common.elements.BaseElement;
import ui.common.elements.LocatorType;

public class SegmentedControl extends BaseElement {

    private static final String CLASS_CHAIN = "**/XCUIElementTypeToolbar/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther";
    private static final String NAME = "Segmented control";

    private SubredditsButton subredditsButton = new SubredditsButton();
    private MultiredditsButton multiredditsButton = new MultiredditsButton();

    public SegmentedControl() {
        super(LocatorType.IOS_CLASS_CHAIN, CLASS_CHAIN, NAME);
    }

    public SubredditsButton getSubredditsButton() {
        return subredditsButton;
    }

    public MultiredditsButton getMultiredditsButton() {
        return multiredditsButton;
    }
}

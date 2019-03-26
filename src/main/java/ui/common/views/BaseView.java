package ui.common.views;

import org.apache.logging.log4j.Logger;
import ui.common.elements.BaseElement;
import utils.BeamLogger;

public abstract class BaseView {

    private Logger logger = BeamLogger.getInstance().getLogger();

    private BaseElement viewAnchorElement;
    private String name;

    public BaseView(BaseElement viewAnchorElement, String name) {
        this.viewAnchorElement = viewAnchorElement;
        this.name = name;
    }

    public boolean isViewVisible() {
        logger.info("Check is " + getName() + " visible");
        return viewAnchorElement.isElementVisible();
    }

    public String getName() {
        return name;
    }

}

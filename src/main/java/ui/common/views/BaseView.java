package ui.common.views;

import org.apache.logging.log4j.Logger;
import ui.common.elements.BaseElement;
import utils.BeamLogger;

public abstract class BaseView {

    private Logger logger = BeamLogger.getInstance().getLogger();

    private BaseElement pageAnchorElement;
    private String name;

    public BaseView(BaseElement pageAnchorElement, String name) {
        this.pageAnchorElement = pageAnchorElement;
        this.name = name;
    }

    public boolean isPageVisible() {
        logger.info("Check is " + getName() + " visible");
        return pageAnchorElement.isElementVisible();
    }

    public String getName() {
        return name;
    }

}

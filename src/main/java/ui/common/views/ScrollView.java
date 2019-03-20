package ui.common.views;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import ui.common.elements.BaseElement;
import utils.BeamLogger;
import utils.driver.BeamDriver;

import java.util.HashMap;
import java.util.Map;

import static io.appium.java_client.touch.offset.PointOption.point;

public class ScrollView extends BaseView {

    private Logger logger = BeamLogger.getInstance().getLogger();
    private IOSDriver driver = BeamDriver.getInstance().getDriver();

    private static final String DIRECTION = "direction";
    private static final String MOBILE_SCROLL = "mobile:scroll";

    public ScrollView(BaseElement pageAnchorElement, String name) {
        super(pageAnchorElement, name);
    }

    public void scrollDownToTheEnd() {
        logger.info("Scroll page down");
        Map<String, Object> scrollObject = new HashMap<>();
        scrollObject.put(DIRECTION, "down");
        driver.executeScript(MOBILE_SCROLL, scrollObject);
    }

    public void scrollUpToTheBeginning() {
        logger.info("Scroll page up");
        Map<String, Object> scrollObject = new HashMap<>();
        scrollObject.put(DIRECTION, "up");
        driver.executeScript(MOBILE_SCROLL, scrollObject);
    }

    public void scroll(double start, double end) {
        TouchAction touchAction = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();
        int x = size.width / 2;
        int startY = (int) (size.height * start);
        int endY = (int) (size.height * end);
        touchAction
                .longPress(point(x, startY))
                .moveTo(point(x, endY))
                .release()
                .perform();
    }

    public void scrollDownToElement(BaseElement baseElement) {
        int maxScrolls = 5;
        while (!baseElement.isElementVisible(2) && maxScrolls > 0) {
            scrollDown();
            maxScrolls--;
        }
    }

    public void scrollDown() {
        logger.info("Scroll down");
        scroll(0.7, 0.3);
    }

    public void scrollUpToElement(BaseElement baseElement) {
        while (!baseElement.isElementVisible(2)) {
            scrollUp();
        }
    }

    public void scrollUp(){
        logger.info("Scroll up");
        scroll(0.3, 0.7);
    }
}

package ui.appviews.passcode.enterpasscode.elements.keyboard;

import ui.common.elements.BaseElement;
import ui.common.elements.ClickableElement;
import ui.common.elements.LocatorType;

import java.util.HashMap;
import java.util.Map;

public class Keyboard extends BaseElement {

    private static final String XPATH = "//XCUIElementTypeOther[@name='keyboard']/XCUIElementTypeOther";
    private static final String NAME = "Keyboard";

    private Map<Character, ClickableElement> keys = new HashMap<>();

    public Keyboard() {
        super(LocatorType.XPATH, XPATH, NAME);
        keys.put('1', new KeyButton(XPATH, 1, 1, "1"));
        keys.put('2', new KeyButton(XPATH, 1, 2, "2"));
        keys.put('3', new KeyButton(XPATH, 1, 3, "3"));
        keys.put('4', new KeyButton(XPATH, 2, 1, "4"));
        keys.put('5', new KeyButton(XPATH, 2, 2, "5"));
        keys.put('6', new KeyButton(XPATH, 2, 3, "6"));
        keys.put('7', new KeyButton(XPATH, 3, 1, "7"));
        keys.put('8', new KeyButton(XPATH, 3, 2, "8"));
        keys.put('9', new KeyButton(XPATH, 3, 3, "9"));
        keys.put('D', new KeyButton(XPATH, 4, 3, "delete"));
    }

    public ClickableElement getKey(char key) {
        return keys.get(key);
    }
}

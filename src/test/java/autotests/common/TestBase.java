package autotests.common;

import appmanager.AppManager;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import utils.TestWatcher;

@TestMethodOrder(OrderAnnotation.class)
@ExtendWith(TestWatcher.class)
public abstract class TestBase {

    protected static final AppManager APP_MANAGER = new AppManager();

}

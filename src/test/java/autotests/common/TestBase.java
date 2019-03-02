package autotests.common;

import appmanager.AppManager;
import org.junit.jupiter.api.extension.ExtendWith;
import utils.TestWatcher;

@ExtendWith(TestWatcher.class)
public abstract class TestBase {

    protected static final AppManager APP_MANAGER = new AppManager();

}

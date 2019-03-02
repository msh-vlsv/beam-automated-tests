package utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BeamLogger {

    private static BeamLogger instance;

    private Logger logger;

    public BeamLogger() {
        logger = LogManager.getLogger();
    }

    public static BeamLogger getInstance() {
        if (instance == null) {
            instance = new BeamLogger();
        }
        return instance;
    }

    public Logger getLogger() {
        return logger;
    }

}

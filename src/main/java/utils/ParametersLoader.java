package utils;

import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public final class ParametersLoader {

    private static Logger logger = BeamLogger.getInstance().getLogger();
    private static Properties inputDataProperties = new Properties();

    private static HashMap<String, Properties> propertiesHashMap = new HashMap<String, Properties>() {{
        put("inputData.properties", inputDataProperties);
    }};


    static {
        propertiesHashMap.keySet().stream().forEach(path -> loadProperties(propertiesHashMap.get(path), path));
    }

    private ParametersLoader() {
    }

    public static String getInputDataProperty(Enum key) {
        return inputDataProperties != null && !inputDataProperties.isEmpty() ? inputDataProperties.getProperty(key.name()) : null;
    }

    private static void loadProperties(Properties propertiesName, String resoursePath) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try (InputStream resourceStream = loader.getResourceAsStream(resoursePath)){
            propertiesName.load(resourceStream);
        } catch (IOException ioe) {
            logger.error(ioe.getMessage());
        }
    }
}

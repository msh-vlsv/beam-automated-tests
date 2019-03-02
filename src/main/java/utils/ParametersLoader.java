package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class ParametersLoader {

    private static Properties inputDataProperties = new Properties();

    private static HashMap<String, Properties> propertiesHashMap = new HashMap<String, Properties>() {{
        put("inputData.properties", inputDataProperties);
    }};


    static {
        propertiesHashMap.keySet().stream().forEach(path -> loadProperties(propertiesHashMap.get(path), path));
    }

    public static String getInputDataProperty(Enum key) {
        return inputDataProperties != null && !inputDataProperties.isEmpty() ? inputDataProperties.getProperty(key.name()) : null;
    }

    private static void loadProperties(Properties propertiesName, String resoursePath) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try (InputStream resourceStream = loader.getResourceAsStream(resoursePath)){
            propertiesName.load(resourceStream);
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}

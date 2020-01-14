package TravelAgencyTests;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Environment {

    private Properties prop = new Properties();
    private Properties loadPropertiesFile(String filePath) {

        try (InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(filePath)) {
            prop.load(resourceAsStream);
        } catch (IOException e) {
            System.err.println("Unable to load properties file : " + filePath);
        }
        return prop;
    }

}

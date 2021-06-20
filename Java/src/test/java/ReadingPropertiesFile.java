import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {
    public void ReadConfigFile() throws IOException {
        FileInputStream file = new FileInputStream("src/main/resources/config.properties");
        Properties properties = new Properties();
        properties.load(file);
        System.out.println(properties.getProperty("Name"));
    }
}

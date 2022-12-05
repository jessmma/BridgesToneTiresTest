package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    //Read the properties file in test/java/config
    //readItem("url") --> https://www.bridgestonetire.com/size/
    //readItem("browser) --> chrome

    static Properties properties;

    public PropertyReader(){
        loadAllProperties();
    }

    public void loadAllProperties(){
        properties = new Properties();
        try{
            String propertyFilePath = System.getProperty("user.dir")+"/src/test/java/config/config.properties";
            properties.load(new FileInputStream(propertyFilePath));

        }catch (IOException e) {
            throw new RuntimeException("Not able to find the file");
        }
    }

    public static String readItem(String propertyName){
        return properties.getProperty(propertyName);
    }
}

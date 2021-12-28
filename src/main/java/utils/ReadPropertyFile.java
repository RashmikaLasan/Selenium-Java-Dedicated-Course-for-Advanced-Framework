package utils;

import constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {

    private ReadPropertyFile(){
    }

    public static String getValue(String key) throws Exception {

        String value="";
        Properties properties = new Properties();
        FileInputStream fs = new FileInputStream(FrameworkConstants.getConfigFilePath());
        properties.load(fs);
        value = properties.getProperty(key);
        if(Objects.isNull(value)){

            throw new Exception("Property name "+ key+ " is not found. Please check the config.properties");
        }

        return value;
    }
}

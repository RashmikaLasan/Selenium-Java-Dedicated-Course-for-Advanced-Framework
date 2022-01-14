package utils;

import constants.FrameworkConstants;
import enums.ConfigProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {

    private ReadPropertyFile(){
    }

    private static Properties properties = new Properties();

    //Static will be the first thing to run when the class is loaded.
    //Execution is fast when there are a lot of test cases. Each time it won't go and check the config.property
    //It loads one time in the memory and refer from it.
    static {

        FileInputStream fs = null;
        try {
            fs = new FileInputStream(FrameworkConstants.getConfigFilePath());
            properties.load(fs);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getValue(ConfigProperties key) throws Exception {

        String value="";
        value = properties.getProperty(key.name().toLowerCase(Locale.ROOT));

        if(Objects.isNull(value)){

            throw new Exception("Property name "+ key+ " is not found. Please check the config.properties");
        }

        return value;
    }
}

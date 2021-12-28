package constants;

public class FrameworkConstants {

    private FrameworkConstants(){

    }

    private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/java/resources/chromedriver.exe";
    private static final String CONFIGFILEPATH = System.getProperty("user.dir")+"/src/test/java/resources/config/config.properties";

    public static String getChromeDriverPath() {

        return CHROMEDRIVERPATH;
    }

    public static String getConfigFilePath() {

        return CONFIGFILEPATH;
    }
}
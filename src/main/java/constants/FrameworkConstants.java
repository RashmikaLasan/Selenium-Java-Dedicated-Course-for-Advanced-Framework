package constants;

public class FrameworkConstants {

    private FrameworkConstants(){

    }

    private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/java/resources/chromedriver.exe";

    public static String getChromeDriverPath() {
        return CHROMEDRIVERPATH;
    }
}

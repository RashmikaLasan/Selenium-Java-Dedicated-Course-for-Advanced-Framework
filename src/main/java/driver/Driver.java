package driver;

import constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver {

    public static WebDriver driver;

    public static void initDriver(){

        if(Objects.isNull(driver)) {

            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
            driver = new ChromeDriver();
            driver.get("https://www.google.com/");

        }
    }

    public static void quitDriver(){

        if (Objects.nonNull(driver)) {
            driver.quit();
            driver=null;

        }
    }
}

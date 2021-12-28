package driver;

import constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ReadPropertyFile;

import java.util.Objects;

public final class Driver {

    private Driver(){
    }

    public static void initDriver() throws Exception {

        if(Objects.isNull(DriverManager.getDriver())) {

            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
            WebDriver driver = new ChromeDriver();
            DriverManager.setDriver(driver);
            DriverManager.getDriver().get(ReadPropertyFile.getValue("url"));

        }
    }

    public static void quitDriver(){

        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();

        }
    }
}

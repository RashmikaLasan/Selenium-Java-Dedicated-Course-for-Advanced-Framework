package tests;

import constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    WebDriver driver;
    protected BaseTest(){
    }

    @BeforeTest
    public void startUp(){

        System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
         driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }
}

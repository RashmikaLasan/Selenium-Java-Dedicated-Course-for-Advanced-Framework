package pages;

import constants.FrameworkConstants;
import driver.DriverManager;
import enums.WaitStrategy;
import factories.ExplicitWaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected void sendKeys(By by, String value, WaitStrategy waitStrategy){

        ExplicitWaitFactory.performExplicitWaitFactory(by, waitStrategy).sendKeys(value);
    }

    protected void click(By by, WaitStrategy waitStrategy){

        ExplicitWaitFactory.performExplicitWaitFactory(by, waitStrategy).click();
    }

    protected String getText(By by, WaitStrategy waitStrategy){

        ExplicitWaitFactory.performExplicitWaitFactory(by, waitStrategy);
        return DriverManager.getDriver().findElement(by).getText();
    }

}

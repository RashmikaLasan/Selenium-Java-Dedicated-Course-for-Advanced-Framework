package pages;

import driver.DriverManager;
import org.openqa.selenium.By;

public class BasePage {

    protected void sendKeys(By by, String value){

        DriverManager.getDriver().findElement(by).sendKeys(value);
    }

    protected void click(By by){

        DriverManager.getDriver().findElement(by).click();
    }

    protected String getText(By by){

        return DriverManager.getDriver().findElement(by).getText();
    }
}

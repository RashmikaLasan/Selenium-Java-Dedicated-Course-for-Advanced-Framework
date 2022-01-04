package pages;

import constants.FrameworkConstants;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected void sendKeys(By by, String value, String waitStrategy){

        if(waitStrategy.equalsIgnoreCase("clickable")){

            waitForElementToBeClickable(by);
        }

        else if (waitStrategy.equalsIgnoreCase("present")){

            waitForElementToBePresent(by);
        }

        DriverManager.getDriver().findElement(by).sendKeys(value);
    }

    protected void click(By by,String waitStrategy){

        if(waitStrategy.equalsIgnoreCase("clickable")){

            waitForElementToBeClickable(by);
        }

        else if (waitStrategy.equalsIgnoreCase("present")){

            waitForElementToBePresent(by);
        }

        DriverManager.getDriver().findElement(by).click();
    }

    protected String getText(By by,String waitStrategy){

        if(waitStrategy.equalsIgnoreCase("clickable")){

            waitForElementToBeClickable(by);
        }

        else if (waitStrategy.equalsIgnoreCase("present")){

            waitForElementToBePresent(by);
        }

        return DriverManager.getDriver().findElement(by).getText();
    }

    private void waitForElementToBeClickable(By by){

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getWaitTimeInSeconds());
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    private void waitForElementToBePresent(By by){

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),FrameworkConstants.getWaitTimeInSeconds());
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}

package pages;

import constants.FrameworkConstants;
import driver.DriverManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected void sendKeys(By by, String value, WaitStrategy waitStrategy){

        if(waitStrategy == WaitStrategy.CLICKABLE){

            waitForElementToBeClickable(by);
        }

        else if (waitStrategy== WaitStrategy.PRESENCE){

            waitForElementToBePresent(by);
        }

        DriverManager.getDriver().findElement(by).sendKeys(value);
    }

    protected void click(By by,WaitStrategy waitStrategy){

        if(waitStrategy== WaitStrategy.CLICKABLE){

            waitForElementToBeClickable(by);
        }

        else if (waitStrategy== WaitStrategy.PRESENCE){

            waitForElementToBePresent(by);
        }

        DriverManager.getDriver().findElement(by).click();
    }

    protected String getText(By by, WaitStrategy waitStrategy){

        if(waitStrategy== WaitStrategy.CLICKABLE){

            waitForElementToBeClickable(by);
        }

        else if (waitStrategy== WaitStrategy.PRESENCE){

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

package pages;

import driver.DriverManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//To prevent of extending this class
//Won't create a constructor here;
public final class OrangeHRMHomePage extends BasePage{

    private final By welcomeLink = By.xpath("//a[@id='welcome']");
    private final By logoutButton = By.xpath("//a[contains(text(),'Logout')]");


    public OrangeHRMHomePage clickWelcomeLink(){

//        DriverManager.getDriver().findElement(welcomeLink).click();
        click(welcomeLink, WaitStrategy.CLICKABLE);
        return this;
    }

    public OrangeHRMLoginPage clickLogoutButton(){

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
//        DriverManager.getDriver().findElement(logoutButton).click();
        click(logoutButton,WaitStrategy.CLICKABLE);
        return new OrangeHRMLoginPage();
    }

}

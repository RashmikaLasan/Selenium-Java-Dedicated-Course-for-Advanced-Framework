package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//To prevent of extending this class
//Won't create a constructor here;
public final class OrangeHRMLoginPage {

    private final By usernameBox = By.xpath("//input[@name='txtUsername']");
    private final By passwordBox = By.xpath("//input[@name='txtPassword']");
    private final By loginButton = By.xpath("//input[@name='Submit']");
    private final By invalidCredsError = By.id("spanMessage");


    public OrangeHRMLoginPage enterUsername(String username){

        DriverManager.getDriver().findElement(usernameBox).sendKeys(username);
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password){

        DriverManager.getDriver().findElement(passwordBox).sendKeys(password);
        return this;
    }

    public OrangeHRMHomePage clickLoginButton(){

        DriverManager.getDriver().findElement(loginButton).click();
        return new OrangeHRMHomePage();
    }

    public String invalidCredsErrorText(){

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(invalidCredsError));
        return DriverManager.getDriver().findElement(invalidCredsError).getText();
    }
}

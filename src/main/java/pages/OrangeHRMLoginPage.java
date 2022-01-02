package pages;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//To prevent of extending this class
//Won't create a constructor here;
public final class OrangeHRMLoginPage extends BasePage{

    private final By usernameBox = By.xpath("//input[@name='txtUsername']");
    private final By passwordBox = By.xpath("//input[@name='txtPassword']");
    private final By loginButton = By.xpath("//input[@name='Submit']");
    private final By invalidCredsError = By.id("spanMessage");


    public OrangeHRMLoginPage enterUsername(String username){

//        DriverManager.getDriver().findElement(usernameBox).sendKeys(username);
        sendKeys(usernameBox,username);
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String passwordValue){

//        DriverManager.getDriver().findElement(passwordBox).sendKeys(password);
        sendKeys(passwordBox,passwordValue);
        return this;
    }

    public OrangeHRMHomePage clickLoginButton(){

//        DriverManager.getDriver().findElement(loginButton).click();
        click(loginButton);
        return new OrangeHRMHomePage();
    }

    public String invalidCredsErrorText(){

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(invalidCredsError));
//        return DriverManager.getDriver().findElement(invalidCredsError).getText();
        return getText(invalidCredsError);
    }
}

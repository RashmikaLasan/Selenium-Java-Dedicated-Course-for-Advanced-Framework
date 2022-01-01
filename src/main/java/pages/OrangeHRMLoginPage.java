package pages;

import driver.DriverManager;
import org.openqa.selenium.By;

//To prevent of extending this class
//Won't create a constructor here;
public final class OrangeHRMLoginPage {

    private final By usernameBox = By.xpath("//input[@name='txtUsername']");
    private final By passwordBox = By.xpath("//input[@name='txtPassword']");
    private final By loginButton = By.xpath("//input[@name='Submit']");
    private final By invalidCredsError = By.id("spanMessage");


    public void enterUsername(String username){

        DriverManager.getDriver().findElement(usernameBox).sendKeys(username);
    }

    public void enterPassword(String password){

        DriverManager.getDriver().findElement(passwordBox).sendKeys(password);
    }

    public void clickLoginButton(){

        DriverManager.getDriver().findElement(loginButton).click();
    }

    public String invalidCredsErrorText() throws InterruptedException {

        Thread.sleep(3000);
        return DriverManager.getDriver().findElement(invalidCredsError).getText();
    }
}

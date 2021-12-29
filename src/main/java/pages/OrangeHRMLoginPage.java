package pages;

import driver.DriverManager;
import org.openqa.selenium.By;

//To prevent of extending this class
//Won't create a constructor here;
public final class OrangeHRMLoginPage {

    private final By usernameBox = By.id("//input[@name='txtUsername']");
    private final By passwordeBox = By.id("//input[@name='txtPassword']");
    private final By loginButton = By.id("//input[@name='Submit']");


    public void enterUsername(String username){

        DriverManager.getDriver().findElement(usernameBox).sendKeys(username);
    }

    public void enterPassword(String password){

        DriverManager.getDriver().findElement(passwordeBox).sendKeys(password);
    }

    public void clickLoginButton(){

        DriverManager.getDriver().findElement(loginButton).click();
    }
}

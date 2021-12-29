package pages;

import driver.DriverManager;
import org.openqa.selenium.By;

//To prevent of extending this class
//Won't create a constructor here;
public final class OrangeHRMHomePage {

    private final By welcomeLink = By.id("///a[@id='welcome']");
    private final By logoutButton = By.id("//a[@xpath='1']");


    public void clickWelcomeLink(){

        DriverManager.getDriver().findElement(welcomeLink).click();
    }

    public void clickLogoutButton() throws InterruptedException {

        Thread.sleep(200);
        DriverManager.getDriver().findElement(logoutButton).click();
    }

}

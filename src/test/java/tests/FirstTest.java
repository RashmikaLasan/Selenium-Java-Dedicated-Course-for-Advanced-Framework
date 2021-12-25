package tests;

import driver.Driver;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void test1() throws InterruptedException {

        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Selenium Automation", Keys.ENTER);
        Thread.sleep(5000);

    }

    @Test
    public void test2() throws InterruptedException {

        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
        Thread.sleep(5000);

    }

}

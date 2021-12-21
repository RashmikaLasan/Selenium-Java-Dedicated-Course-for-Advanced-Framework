package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/java/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium Automation", Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();

    }

    @Test
    public void test2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/java/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();

    }

}

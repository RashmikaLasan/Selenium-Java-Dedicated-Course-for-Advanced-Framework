package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OrangeHRMHomePage;
import pages.OrangeHRMLoginPage;

public final class OrangeHRMTest extends BaseTest {

    private OrangeHRMTest(){
    }

    @Test(enabled = false)
    public void loginTest() throws InterruptedException {

        OrangeHRMLoginPage lp = new OrangeHRMLoginPage();
        OrangeHRMHomePage hp = new OrangeHRMHomePage();

        lp.enterUsername("Admin");
        lp.enterPassword("admin321");
        lp.clickLoginButton();
        hp.clickWelcomeLink();
        hp.clickLogoutButton();

    }

    @Test
    public void loginWithInvalidCredsTet() throws InterruptedException {

        OrangeHRMLoginPage lp = new OrangeHRMLoginPage();
        OrangeHRMHomePage hp = new OrangeHRMHomePage();

        lp.enterUsername("Admin123");
        lp.enterPassword("admin321");
        lp.clickLoginButton();

        Assert.assertEquals(lp.invalidCredsErrorText(),"Invalid credentials");

    }
}

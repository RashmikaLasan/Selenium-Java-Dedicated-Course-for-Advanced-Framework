package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OrangeHRMHomePage;
import pages.OrangeHRMLoginPage;

public final class OrangeHRMTest extends BaseTest {

    private OrangeHRMTest(){
    }

    @Test
    public void loginTest(){

        OrangeHRMLoginPage lp = new OrangeHRMLoginPage();
//        OrangeHRMHomePage hp = new OrangeHRMHomePage();

        lp.enterUsername("Admin").
            enterPassword("admin123").
            clickLoginButton().
            clickWelcomeLink().
            clickLogoutButton();

    }

    @Test
    public void loginWithInvalidCredsTet() throws InterruptedException {

        OrangeHRMLoginPage lp = new OrangeHRMLoginPage();
        OrangeHRMHomePage hp = new OrangeHRMHomePage();

        lp.enterUsername("Admin123").
            enterPassword("admin321").
            clickLoginButton();

        Assert.assertEquals(lp.invalidCredsErrorText(),"Invalid credentials");

    }
}

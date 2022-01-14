package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.OrangeHRMHomePage;
import pages.OrangeHRMLoginPage;

public final class OrangeHRMTest extends BaseTest {

    private OrangeHRMTest(){

    }

    @Test(dataProvider = "LoginTestData")
    public void loginTest(String username, String password){

        OrangeHRMLoginPage lp = new OrangeHRMLoginPage();
//        OrangeHRMHomePage hp = new OrangeHRMHomePage();

        lp.enterUsername(username).
            enterPassword(password).
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

    @DataProvider(name="LoginTestData")
    public Object[][] getData(){

        return new Object[][]{
                {"Adminsssss","admin1234567"},
                {"Admin123","admin"},
                {"Adminsdsdsd","admin123sdsdsdsd"}
        };
//Test
    }
}

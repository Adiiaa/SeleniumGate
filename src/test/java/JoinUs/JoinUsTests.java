package JoinUs;

import Base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.JoinUsPage;

public class JoinUsTests extends BaseTests {

    @Test
    public void testJoinUsLoginAndCreateAccountFlow() {
        JoinUsPage loginPage = homePage.clickJoinUsLink();

        loginPage.enterEmail("wrong@test.com")
                .enterPassword("incorrectPassword")
                .clickSignIn();

        Assert.assertTrue(
                loginPage.isStillOnLoginPage(),
                "Expected to remain on Login Page after invalid login"
        );

        CreateAccountPage createAccount = loginPage.clickCreateAccount();

        createAccount.enterFirstName("John")
                .enterLastName("Tester")
                .enterEmail("john.tester@example.com")
                .enterPhone("1234567890")
                .clickCreateAccount();

        Assert.assertTrue(
                createAccount.isStillOnCreateAccountPage(),
                "Expected to remain on Create Account Page"
        );
    }

}

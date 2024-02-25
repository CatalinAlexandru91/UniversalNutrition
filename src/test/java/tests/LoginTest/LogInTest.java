package tests.LoginTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage.LogInPage;
import tests.BaseTest;

import static pages.BasePage.*;

public class LogInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(LogInTest.class);
    private Object sleep;


    String emailaddress = "alex.tarachiu91@gmail.com";
    String firstName = "Catalin-Alexandru";
    String lastName = "Tarachiu";

    @Test
    public void logIn() {

        LOG.info("Verify if search bar is displayed");
        Assert.assertTrue(logInPage.isSearchBarDisplayed(), "Logo is not displayed");

        LOG.info("Verify if logo is displayed");
        Assert.assertTrue(logInPage.isLogoDisplayed(), "Logo is not displayed");

        LOG.info("Click 'My Account' button");
        logInPage.clickMyAccountButton();

        LOG.info("Insert email address");
        logInPage.insertEmailAddress(emailaddress);

        LOG.info("Click privacy policy box");
        logInPage.clickPrivacyPolicyBox();

        LOG.info("Click 'Create Account' button");
        logInPage.clickCreateAccountButton();

        LOG.info("Click second privacy policy box");
        logInPage.clickSecondPrivacyPolicyBox();





    }
}

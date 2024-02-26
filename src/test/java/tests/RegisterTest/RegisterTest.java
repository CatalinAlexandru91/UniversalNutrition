package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private Object sleep;


    String emailaddress = "proteine3@gmail.com";
    String firstName = "Ion";
    String lastName = "Popescu";
    String password = "proteine123";

    @Test
    public void registerAccount() {

        LOG.info("Verify if search bar is displayed");
        Assert.assertTrue(registerPage.isSearchBarDisplayed(), "Logo is not displayed");

        LOG.info("Verify if logo is displayed");
        Assert.assertTrue(registerPage.isLogoDisplayed(), "Logo is not displayed");

        LOG.info("Click 'My Account' button");
        registerPage.clickMyAccountButton();

        LOG.info("Insert email address");
        registerPage.insertEmailAddress(emailaddress);

        LOG.info("Click privacy policy box");
        registerPage.clickPrivacyPolicyBox();

        LOG.info("Click 'Create Account' button");
        registerPage.clickCreateAccountButton();

        sleep(3000L);
        LOG.info("Click second privacy policy box");
        registerPage.clickSecondPrivacyPolicyBox();

        LOG.info("Typing full name");
        registerPage.insertFullName(firstName, lastName);

        LOG.info("Insert 'Password'");
        registerPage.insertPassword(password);

        LOG.info("Click 'Mr.' option");
        registerPage.clickMaleGenderButton();

        sleep(3000L);
        LOG.info("Select '27' option");
        registerPage.selectBirthDay();

        LOG.info("Select 'July' option");
        registerPage.selectBirthMonth();

        LOG.info("Select '1991' option");
        registerPage.selectBirthYear();

        LOG.info("Click 'Newsletter' box");
        registerPage.clickNewsletterBox();

        LOG.info("Click 'Special offers' box");
        registerPage.clickNewsletterBox();

        LOG.info("Click 'Register' button");
        registerPage.clickRegisterButton();

        LOG.info("Click 'Log out' button");
        registerPage.clickLogOutButton();

    }
}

package tests.LoginTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class LogInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(LogInTest.class);
    private Object sleep;

    @Test
    public void logIn() {

        LOG.info("Verify if logo is displayed");
        Assert.assertTrue(logInPage.isLogoDisplayed(), "Logo is not displayed");

        LOG.info("Verify if 'Top menu' button is displayed");
        Assert.assertTrue(logInPage.isTopMenuDisplayed());
    }
}

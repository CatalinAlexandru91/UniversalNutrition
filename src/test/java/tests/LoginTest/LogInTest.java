package tests.LoginTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LogInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(LogInTest.class);

    @Test
    public void logIn(){

        LOG.info("Verify if logo is displayed");
        Assert.assertTrue(logInPage.isLogoDisplayed(), "Logo is not displayed");

    }
}

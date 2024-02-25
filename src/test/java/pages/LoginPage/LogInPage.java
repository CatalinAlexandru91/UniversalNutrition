package pages.LoginPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class LogInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(LogInPage.class);
    public static LogInPage instance;

    private LogInPage() {
    }

    public static LogInPage getInstance() {
        if (instance == null) {
            instance = new LogInPage();
        }
        return instance;
    }

    private By logo = By.id("logo");
    private By topMenu = By.id("topmenu");
    private By logInButton = By.id("login-button-id");

    public boolean isLogoDisplayed() {
        LOG.info("Verify if logo image is displayed");
        return driver.findElement(logo).isDisplayed();

    }

    public boolean isTopMenuDisplayed() {
        LOG.info("Verify if 'Top menu' button is displayed");
        return driver.findElement(topMenu).isDisplayed();


    }
public void clickLogInButton(){
        LOG.info("Click 'Log In' button");
        driver.findElement(logInButton);
}
}




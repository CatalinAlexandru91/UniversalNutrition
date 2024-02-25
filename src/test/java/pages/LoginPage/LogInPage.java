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

    private By logo = By.xpath("//img[@class='logo img-responsive']");
    private By searchBar = By.id("search_query_top");
    private By myAccountButton = By.xpath("//a[text()='Contul meu']");
    private By inputEmailAddress = By.id("email_create");
    private By createAccountbutton = By.id("SubmitCreate");
    private By privacyPolicy = By.id("cgv");
    private By privacyPolicy2 = By.id("customer_privacy");


    public boolean isSearchBarDisplayed() {
        LOG.info("Verify if search bar is displayed");
        return driver.findElement(searchBar).isDisplayed();

    }

    public boolean isLogoDisplayed() {
        LOG.info("Verify if logo image is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public void clickMyAccountButton() {
        LOG.info("Click 'My Account' button");
        driver.findElement(myAccountButton).click();

    }

    public void insertEmailAddress(String emailaddress) {
        LOG.info("Insert email address");
        driver.findElement(inputEmailAddress).sendKeys(emailaddress);
    }

    public void clickPrivacyPolicyBox() {
        LOG.info("Click privacy policy box");
        driver.findElement(privacyPolicy).click();

    }

    public void clickCreateAccountButton() {
        LOG.info("Click 'Create Account' button");
        driver.findElement(createAccountbutton).click();

    }

    public void clickSecondPrivacyPolicyBox() {
        LOG.info("Click second privacy policy box");
        driver.findElement(privacyPolicy2).click();


    }
}













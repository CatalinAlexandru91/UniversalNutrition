package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
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
    private By inputFirstName = By.id("customer_lastname");
    private By inputLastName = By.id("customer_firstname");
    private By passwordField = By.id("passwd");
    private By selectGender = By.id("id_gender1");
    private By selectBirthDay = By.id("days");
    private By selectBirthMonth = By.id("months");
    private By selectBirthYear = By.id("years");
    private By newsletterBox = By.id("newsletter");
    private By specialOffersBox = By.id("optin");
    private By registerButton = By.id("submitAccount");
    private By logOutButton = By.xpath("//a[text()='Deconectare']");

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

    public void insertFullName(String fName, String lName) {
        LOG.info("Inserting FirstName and LastName");
        driver.findElement(inputFirstName).sendKeys(fName);
        driver.findElement(inputLastName).sendKeys(lName);

    }

    public void insertPassword(String Password) {
        LOG.info("input 'Password' in field");
        driver.findElement(passwordField).sendKeys("Password");

    }

    public void clickMaleGenderButton() {
        LOG.info("Click 'Mr.' option");
        driver.findElement(selectGender).click();


    }

    public void selectBirthDay() {
        LOG.info("Select '27' option");
        driver.findElement(selectBirthDay).sendKeys("27");

    }

    public void selectBirthMonth() {
        LOG.info("Select 'July' option");
        driver.findElement(selectBirthMonth).sendKeys("Iulie");


    }

    public void selectBirthYear() {
        LOG.info("Select '1991' option");
        driver.findElement(selectBirthYear).sendKeys("1991");
    }

    public void clickNewsletterBox() {
        LOG.info("Click 'Newsletter' box");
        driver.findElement(newsletterBox).click();
    }

    public void clickSpecialOffersBox() {
        LOG.info("Click 'Special offers' box");
        driver.findElement(newsletterBox).click();

    }

    public void clickRegisterButton() {
        LOG.info("Click 'Register' button");
        driver.findElement(registerButton).click();
    }

    public void clickLogOutButton() {
        LOG.info("Click 'LogOut' option");
        driver.findElement(logOutButton).click();
    }
}










